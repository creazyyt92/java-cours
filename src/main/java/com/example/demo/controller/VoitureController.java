package com.example.demo.controller;

import com.example.demo.model.Voiture;
import com.example.demo.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voiture")
public class VoitureController {

    private final VoitureService voitureService;

    @Autowired
    public VoitureController(VoitureService voitureService) {this.voitureService = voitureService;}

    @PostMapping
    public Voiture create(@RequestParam String marqueModel,
                          @RequestParam String nomModel,
                          @RequestParam String couleur,
                          @RequestParam int anneeModel,
                          @RequestParam int prix,
                          @RequestParam int vitesse,
                          @RequestParam int essence){

        return voitureService.create(marqueModel, nomModel, couleur, anneeModel, prix, vitesse, essence);
    }

    @GetMapping
    public List<Voiture> getAll(){
        return voitureService.getAll();
    }

}