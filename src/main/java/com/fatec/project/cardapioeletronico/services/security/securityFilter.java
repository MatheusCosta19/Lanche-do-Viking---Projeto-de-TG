package com.fatec.project.cardapioeletronico.services.security;

import java.nio.file.DirectoryStream.Filter;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fatec.project.cardapioeletronico.models.ModelPerson;
import com.fatec.project.cardapioeletronico.repositories.RepositoryPerson;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//filtro de segurança dos tokens
@Component
public class securityFilter extends OncePerRequestFilter{

    @Autowired
    ServiceToken tokenService;

    @Autowired
    RepositoryPerson personRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain){
        var token = this.recoverToken(request);
        var login = tokenService.validToken(token);

        if(login != null){
            ModelPerson person = personRepository.findByEmail(login).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
            var authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));//autoridade da aplicação, por enquanto, é o usuário
            var authentication = new UsernamePasswordAuthenticationToken(person, null, authorities);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

    }

    private String recoverToken(HttpServletRequest request){
        var autHeader = request.getHeader("Authorization");
        if(autHeader == null) return null;
        return autHeader.replace("Baerer", "");
    }
    
}
