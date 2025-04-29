package com.fatec.project.cardapioeletronico.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.project.cardapioeletronico.models.ModelClient;
import com.fatec.project.cardapioeletronico.services.ServicePersonalData;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//classe voltada para a criação de uma conta ou entrada na plataforma
@RestController
@RequestMapping("/account")
public class ProfileController {
    
    private final ServicePersonalData personalData;

    public ProfileController(ServicePersonalData personalData){

        this.personalData = personalData;
    }

    @PostMapping("/login")
    public String makeLogin(){

        return "";  //página de login
    }

    @PostMapping("/register")
    public String makeAnAccount(){

        return "";  //página de cadastro
    }

    @PostMapping
    public ModelClient addClient(@RequestBody ModelClient client){

        return personalData.savePersonalData(client);
    }

    @GetMapping
    public List<ModelClient> listClient(){
        
        return personalData.list();
    }
    
}
