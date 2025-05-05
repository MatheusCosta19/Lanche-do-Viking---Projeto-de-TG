package com.fatec.project.cardapioeletronico.models;


public class ModelClient {
    private String clientName;
    private String clientPass;
    private String clientEmail;//tranformar em DATE

    public String getclientName() {
        return clientName;
    }
    public void setclientName(String clientName) {
        this.clientName = clientName;
    }
    public String getclientPass() {
        return clientPass;
    }
    public void setclientPass(String clientPass) {
        this.clientPass = clientPass;
    }
    public String getclientEmail() {
        return clientEmail;
    }
    public void setclientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }
}
