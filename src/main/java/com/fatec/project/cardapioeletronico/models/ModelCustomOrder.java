package com.fatec.project.cardapioeletronico.models;

public class ModelCustomOrder {
    private double   unitary_Price_Item;
    private String   unitary_Name_Item;
    private int      discount = 0;
    private double   custom_Item_Price;
    private double   Final_Price;
    private String[] compound;

    
    public double getUnitary_Price_Item() {
        return unitary_Price_Item;
    }
    public void setUnitary_Price_Item(double unitary_Price_Item) {
        this.unitary_Price_Item = unitary_Price_Item;
    }
    public String getUnitary_Name_Item() {
        return unitary_Name_Item;
    }
    public void setUnitary_Name_Item(String unitary_Name_Item) {
        this.unitary_Name_Item = unitary_Name_Item;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public double getCustom_Item_Price() {
        return custom_Item_Price;
    }
    public void setCustom_Item_Price(double custom_Item_Price) {
        this.custom_Item_Price = custom_Item_Price;
    }
    public double getFinal_Price() {
        return Final_Price;
    }
    public void setFinal_Price(double final_Price) {
        Final_Price = final_Price;
    }
    public String[] getCompound() {
        return compound;
    }
    public void setCompound(String[] compound) {
        this.compound = compound;
    }

    
}
