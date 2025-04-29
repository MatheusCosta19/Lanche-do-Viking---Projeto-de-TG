package com.fatec.project.cardapioeletronico.models;

//registrar novos produtos na plataforma
public class ModelMenuItem {
    private byte[]   itemPicture;
    private String   itemName;
    private String   description;
    private double   unityPrice;
    private double   discount;
    private String[] alergenics;
    //private Ingredients ingredients; ||ingredientes serão postos aqui. Ainda falta criar a classe de ingredientes
    
    public byte[] getItemPicture() {
        return itemPicture;
    }
    public void setItemPicture(byte[] itemPicture) {
        this.itemPicture = itemPicture;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getUnityPrice() {
        return unityPrice;
    }
    public void setUnityPrice(double unityPrice) {
        this.unityPrice = unityPrice;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public String[] getAlergenics() {
        return alergenics;
    }
    public void setAlergenics(String[] alergenics) {
        this.alergenics = alergenics;
    }

    

}
