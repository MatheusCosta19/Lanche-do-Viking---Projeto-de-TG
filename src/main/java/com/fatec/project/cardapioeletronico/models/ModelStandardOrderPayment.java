package com.fatec.project.cardapioeletronico.models;

import java.util.Date;

// Para pedidos feitos no cartão
public class ModelStandardOrderPayment{

    private String titular_Client;
    private String CPF;
    private String address;
    private int    CEP;
    private int    card_Number;
    private Date   card_Expiration_Date;
    private String card_Flag;


    public String getTitular_Client() {
        return titular_Client;
    }
    public void setTitular_Client(String titular_Client) {
        this.titular_Client = titular_Client;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getCEP() {
        return CEP;
    }
    public void setCEP(int cEP) {
        CEP = cEP;
    }
    public int getCard_Number() {
        return card_Number;
    }
    public void setCard_Number(int card_Number) {
        this.card_Number = card_Number;
    }
    public Date getCard_Expiration_Date() {
        return card_Expiration_Date;
    }
    public void setCard_Expiration_Date(Date card_Expiration_Date) {
        this.card_Expiration_Date = card_Expiration_Date;
    }
    public String getCard_Flag() {
        return card_Flag;
    }
    public void setCard_Flag(String card_Flag) {
        this.card_Flag = card_Flag;
    }
}