package com.example.demo.service;

import com.example.demo.model.Voiture;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoitureService {

    private final List<Voiture> voitures = new ArrayList<>();

    public Voiture create(String marqueModel,
                          String nomModel,
                          String couleur,
                          int anneeModel,
                          int prix,
                          int vitesse,
                          int essence)
    {
        Voiture voiture = new Voiture(marqueModel, nomModel, couleur, anneeModel, prix, vitesse, essence);
        voitures.add(voiture);
        return voiture;
    }

    public List<Voiture> getAll() {
        return voitures;
    }
}