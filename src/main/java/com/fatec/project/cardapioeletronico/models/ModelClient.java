package com.fatec.project.cardapioeletronico.models;

import java.util.Date;

public class ModelClient {
    private String client_Name;
    private String client_Pass;
    private String client_Email;
    private Date   bith_Date_Client;

    public String getclient_Name() {
        return client_Name;
    }
    public void setclient_Name(String client_Name) {
        this.client_Name = client_Name;
    }
    public String getclient_Pass() {
        return client_Pass;
    }
    public void setclient_Pass(String client_Pass) {
        this.client_Pass = client_Pass;
    }
    public String getclient_Email() {
        return client_Email;
    }
    public void setclient_Email(String client_Email) {
        this.client_Email = client_Email;
    }
    public Date getbith_Date_Client() {
        return bith_Date_Client;
    }
    public void setbith_Date_Client(Date bith_Date_Client) {
        this.bith_Date_Client = bith_Date_Client;
    }
}
