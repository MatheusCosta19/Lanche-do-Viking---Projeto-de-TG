package com.fatec.project.cardapioeletronico.models;

//modelo de produtos para aparecer na interface
public class ModelMenuDisplay {

    //nome do produto
    private String nameProd;
    //preço do produto
    private double priceProd;
    //imagem do produto
    private byte[]   photoProd;
    //categoria do produto
    private String category;


    public String getNameProd() {
        return nameProd;
    }
    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }
    public double getPriceProd() {
        return priceProd;
    }
    public void setPriceProd(double priceProd) {
        this.priceProd = priceProd;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public byte[] getPhotoProd() {
        return photoProd;
    }
    public void setPhotoProd(byte[] photoProd) {
        this.photoProd = photoProd;
    }

    

}
