package com.fatec.project.cardapioeletronico.services.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.fatec.project.cardapioeletronico.models.ModelPerson;


//gerar lógica de validação dos tokens e autenticação
@Service
public class ServiceToken {

    @Value("${api.security.token.secret}") //valor de recuperação da chave
        private String secret;
    //gerar token
    public String generateToken(ModelPerson person){

        try{
            Algorithm algorithm = Algorithm.HMAC256(secret);  //criptografar

            String token = JWT.create()
            .withIssuer("cardapio-eletronico")
            .withSubject(person.getEmail())
            .withExpiresAt(this.generateExpirationDate())
            .sign(algorithm);
            
            return token;
        }
        catch(JWTCreationException ex){
            throw new RuntimeException("Erro em autenticação");
        }

    }

    //validar token gerado
    public String validToken(String token){

        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
             return JWT.require(algorithm)
             .withIssuer("cardapio-eletronico")
             .build()
             .verify(token)//verificar token
             .getSubject();
            
        } 
        catch (JWTVerificationException ex) {
            return null;
        }
    }

    //gerar data de expiração do token
    private Instant generateExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-3h"));//tempo atual + 2 horas no instante localizado no fuso horário de Brasília
    }

}
