package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoitureAbstractClass {

    private static int COMPTEUR= 1;

    int id;
    @JsonProperty("marqueModel")
    String marqueModel;
    @JsonProperty("nomModel")
    String nomModel;
    @JsonProperty("couleur")
    String couleur;
    @JsonProperty("anneeModel")
    int anneeModel;
    @JsonProperty("prix")
    int prix;
    @JsonProperty("vitesse")
    int vitesse;
    @JsonProperty("essence")
    int essence;

    public VoitureAbstractClass(String marqueModel,
                                String nomModel,
                                String couleur,
                                int anneeModel,
                                int prix,
                                int vitesse,
                                int essence){
        this.id=COMPTEUR++;
        this.marqueModel = marqueModel;
        this.nomModel = nomModel;
        this.couleur = couleur;
        this.anneeModel = anneeModel;
        this.prix = prix;
        this.vitesse = vitesse;
        this.essence = essence;

    }

}

