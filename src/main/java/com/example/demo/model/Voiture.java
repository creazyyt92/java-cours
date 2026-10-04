package com.example.demo.model;

public class Voiture extends VoitureAbstractClass implements VoitureInterface{

    public Voiture(String marqueModel,
                   String nomModel,
                   String couleur,
                   int anneeModel,
                   int prix,
                   int vitesse,
                   int essence){
        super (marqueModel, nomModel, couleur, anneeModel, prix, vitesse, essence);
    }
}


