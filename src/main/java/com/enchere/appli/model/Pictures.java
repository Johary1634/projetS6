package com.enchere.appli.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photo")
public class Pictures
{
    private String id;
    private int idproduit;
    private String image;

    public Pictures(String id, int idproduit, String image) {
        this.id = id;
        this.idproduit = idproduit;
        this.image = image;
    }

    public Pictures() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
