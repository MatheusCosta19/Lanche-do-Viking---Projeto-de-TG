package com.fatec.project.cardapioeletronico.models;

import java.util.Date;

//modelo genéricos para pessoa
public class ModelPerson {
    private long   ID;
    private String name;
    private Date   birth_Date;
    private String email;
    private String pass;

    
    public long getID() {
        return ID;
    }
    public void setID(long iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirth_Date() {
        return birth_Date;
    }
    public void setBirth_Date(Date birth_Date) {
        this.birth_Date = birth_Date;
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
