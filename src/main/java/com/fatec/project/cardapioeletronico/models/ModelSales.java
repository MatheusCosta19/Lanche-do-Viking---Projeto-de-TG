package com.fatec.project.cardapioeletronico.models;

//Modelo para obter os dados do banco
public class ModelSales {
    private String client_Name;
    private Long client_Id;
    private String[] order;
    private double unit_Value;
    private double total_Value;


    public String getClient_Name() {
        return client_Name;
    }
    public Long getClient_Id() {
        return client_Id;
    }
    public String[] getOrder() {
        return order;
    }
    public double getUnit_Value() {
        return unit_Value;
    }
    public double getTotal_Value() {
        return total_Value;
    }

}
