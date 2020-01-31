package com.example.android.hiragana;

public class ItemDetails {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getGambar() {
        return image;
    }

    public void setGambar(int image) {
        this.image = image;
    }

    public int getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }

    private String name;
    private String itemDescription;
    private String tittle;
    private int image;
    private int suara;


}
