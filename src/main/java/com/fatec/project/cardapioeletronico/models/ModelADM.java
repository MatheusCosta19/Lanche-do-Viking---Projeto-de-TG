package com.fatec.project.cardapioeletronico.models;

//modelo para o adm. Herda da classe ModelPerson
public class ModelADM extends ModelPerson{

    private String CNPJ;
    private byte[] profile_Picture;

    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public byte[] getProfile_Picture() {
        
        return profile_Picture;
    }
    public void setProfile_Picture(byte[] profile_Picture) {
        this.profile_Picture = profile_Picture;
    }
    
    //da classe genérica

    public String getBirthDate(){
        return super.getbirthDate();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getPass() {
        return super.getPass();
    }

    
}
