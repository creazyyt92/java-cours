package com.example.demo.controller;

import com.example.demo.model.Concessionnaire;
import com.example.demo.service.ConcessionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concessionnaire")
public class ConcessionnaireController {

    private final ConcessionnaireService concessionnaireService;

    @Autowired
    public ConcessionnaireController(ConcessionnaireService concessionnaireService) {this.concessionnaireService = concessionnaireService;}

    @PostMapping
    public Concessionnaire create(@RequestParam String nomConcess,
                                  @RequestParam int nombreVoiture,
                                  @RequestParam int argent,
                                  @RequestParam int placeVoiture){

        return concessionnaireService.create(nomConcess, nombreVoiture, argent, placeVoiture);
    }

    @GetMapping
    public List<Concessionnaire> getAll(){
        return concessionnaireService.getAll();
    }

}