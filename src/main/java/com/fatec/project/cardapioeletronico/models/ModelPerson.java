package com.fatec.project.cardapioeletronico.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//modelo genéricos para pessoa

@Entity
@Table(name="pessoa")
@AllArgsConstructor
@NoArgsConstructor

public class ModelPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String   ID;
    private String name;
    private String birthDate;
    private String email;
    private String pass;

    
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getbirthDate() {
        return birthDate;
    }
    public void setbirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    

}
