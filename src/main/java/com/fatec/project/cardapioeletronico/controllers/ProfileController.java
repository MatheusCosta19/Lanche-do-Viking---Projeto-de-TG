package com.fatec.project.cardapioeletronico.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.project.cardapioeletronico.dto.LoginRequestDTO;
import com.fatec.project.cardapioeletronico.dto.RegisterRequestDTO;
import com.fatec.project.cardapioeletronico.dto.ResponseDTO;
import com.fatec.project.cardapioeletronico.models.ModelPerson;
import com.fatec.project.cardapioeletronico.repositories.Repository_Person;
import com.fatec.project.cardapioeletronico.services.ServicePersonalData;
import com.fatec.project.cardapioeletronico.services.security.ServiceToken;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//classe voltada para a criação de uma conta ou entrada na plataforma
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class ProfileController {
    
    @Autowired
    private final Repository_Person repository;//repositório
    private final PasswordEncoder   passwordEncoder;  //criptador de senha
    private final ServiceToken      tokenService;   //serviço gerador de token




    @PostMapping("/login")
    public ResponseEntity makeLogin(@RequestBody LoginRequestDTO requestBody){
        ModelPerson person = this.repository.findByEmail(requestBody.email()).orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
        if(passwordEncoder.matches(person.getPass(), requestBody.password())){
            String token = this.tokenService.generateToken(person);

            return ResponseEntity.ok(new ResponseDTO(person.getName(), token));  //página de login
        }
        
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/register")
    public ResponseEntity makeAnAccount(@RequestBody RegisterRequestDTO requestBody){
        Optional<ModelPerson> person = this.repository.findByEmail(requestBody.email());    //verificar se já existe esse usuário
        if(person.isEmpty()){   //se não houver...
    
            ModelPerson newPerson = new ModelPerson();
            newPerson.setPass(passwordEncoder.encode(requestBody.password()));
            newPerson.setEmail(requestBody.email());
            newPerson.setName(requestBody.name());
            this.repository.save(newPerson);

            String token = this.tokenService.generateToken(newPerson);
                
            return ResponseEntity.ok(new ResponseDTO(newPerson.getName(), token));  //página de login
        }
        
        return ResponseEntity.badRequest().build();
    }
   
}
