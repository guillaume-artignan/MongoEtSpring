package com.ipi.nosql;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ban")
public class Address {

    @Id
    private String id;
    private String nom_voie;
    private Integer numero;
    private String nom_commune;
    private String code_postal;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom_voie() {
        return nom_voie;
    }

    public void setNom_voie(String nom_voie) {
        this.nom_voie = nom_voie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNom_commune() {
        return nom_commune;
    }

    public void setNom_commune(String nom_commune) {
        this.nom_commune = nom_commune;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }
}
