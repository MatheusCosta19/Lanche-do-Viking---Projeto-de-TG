package com.fatec.project.cardapioeletronico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    //rota para iniciar a página principal do site
    @GetMapping("/")
    public String launchMainPage(){
        
        return "index";
    }

    //página de login
    @PostMapping("/login")
    public String loginOnPlatform() {
        
        return "other";//colocar o nome da página de Login, quando existir
    }
    
    //página de cadastro
    @PostMapping("/register")
    public String registerOnPlatform() {
        return ""; //página de registro
    }
    
    //em caso de erro...
    @GetMapping("/error")
    public String getMethodName() {
    
        return "error";
    }
}
