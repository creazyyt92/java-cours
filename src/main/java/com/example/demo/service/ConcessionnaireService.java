package com.example.demo.service;

import com.example.demo.model.Concessionnaire;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConcessionnaireService {

    private final List<Concessionnaire> concessionnaires = new ArrayList<>();

    public Concessionnaire create(String nomConcess,
                                  int nombreVoiture,
                                  int argent,
                                  int placeVoiture) {
        Concessionnaire concessionnaire = new Concessionnaire(nomConcess, nombreVoiture, argent, placeVoiture);
        concessionnaires.add(concessionnaire);
        return concessionnaire;
    }

    public List<Concessionnaire> getAll() {
        return concessionnaires;
    }
}