package com.fatec.project.cardapioeletronico.services.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.fatec.project.cardapioeletronico.models.ModelPerson;
import com.fatec.project.cardapioeletronico.repositories.Repository_Person;

@Component
public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private Repository_Person repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        ModelPerson person = this.repository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
        
        return new org.springframework.security.core.userdetails.User(person.getEmail(), person.getPass(), new ArrayList<>());
    }

}
