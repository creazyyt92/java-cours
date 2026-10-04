package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConcessionnaireAbstractClass {

    private static int COMPTEUR= 1;

    int id;
    @JsonProperty("nomConcess")
    String nomConcess;
    @JsonProperty("nombreVoiture")
    int nombreVoiture;
    @JsonProperty("argent")
    int argent;
    @JsonProperty("placeVoiture")
    int placeVoiture;

    public ConcessionnaireAbstractClass(String nomConcess,
                                        int nombreVoiture,
                                        int argent,
                                        int placeVoiture){
        this.id=COMPTEUR++;
        this.nomConcess = nomConcess;
        this.nombreVoiture = nombreVoiture;
        this.argent = argent;
        this.placeVoiture = placeVoiture;
    }

}

