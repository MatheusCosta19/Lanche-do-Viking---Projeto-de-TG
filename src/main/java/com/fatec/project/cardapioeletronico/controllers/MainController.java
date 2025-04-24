package com.fatec.project.cardapioeletronico.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class MainController {

    //rota para iniciar a página principal do site
    @GetMapping("/")
    public String launchMainPage(){
        
        return "index";
    }

    @GetMapping("/login")
    public String loginOnPlatform() {

        return "LoginPage";//colocar o nome da página de Login, quando existir
    }

    @GetMapping("/register")
    public String registerOnPlatform(@RequestParam String param) {
        return new String();
    }
    
    


    
    
}
