package com.fatec.project.cardapioeletronico.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

//classe voltada para a criação de uma conta ou entrada na plataforma
@RestController
@RequestMapping("/account")
public class ProfileController {
    
    @GetMapping("/login")
    public String makeLogin(){

        return "";  //página de login
    }

    @GetMapping("/register")
    public String makeAnAccount(){

        return "";  //página de cadastro
    }
}
