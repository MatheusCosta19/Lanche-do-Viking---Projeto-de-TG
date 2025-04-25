package com.fatec.project.cardapioeletronico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    //rota para iniciar a página principal do site
    @GetMapping("/")
    public String launchMainPage(){
        
        return "index";
    }

    @GetMapping("/error")
    public String getMethodName() {

        return "error";
    }
    

    @GetMapping("/login")
    public String loginOnPlatform() {

        return "other";//colocar o nome da página de Login, quando existir
    }

    @GetMapping("/register")
    public String registerOnPlatform(@RequestParam String param) {
        return new String();
    }
    
    


    
    
}
