package com.fatec.project.cardapioeletronico.models;

//Padrão para pedidos dos cliente
public class ModelStandardOrder{

    private String order_Name;
    private int    order_Quantity;
    private int    discount;
    private String payment_Tipe; //haverá alguns tipos de pagamento. Colocar em uma estrutura de dados com os tipos de pagamento já pré-dispostos
    private double final_Value;


    public String getOrder_Name() {
        return order_Name;
    }
    public void setOrder_Name(String order_Name) {
        this.order_Name = order_Name;
    }
    public int getOrder_Quantity() {
        return order_Quantity;
    }
    public void setOrder_Quantity(int order_Quantity) {
        this.order_Quantity = order_Quantity;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String getPayment_Tipe() {
        return payment_Tipe;
    }
    public void setPayment_Tipe(String payment_Tipe) {
        this.payment_Tipe = payment_Tipe;
    }
    public double getFinal_Value() {
        return final_Value;
    }
    public void setFinal_Value(double final_Value) {
        this.final_Value = final_Value;
    }
}