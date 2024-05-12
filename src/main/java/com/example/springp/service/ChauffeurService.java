package com.example.springp.service;

import com.example.springp.entity.Chauffeur;

import java.util.List;

public interface ChauffeurService {

    List<Chauffeur> getAllChauffeur();

    Chauffeur CreateChauffeur(Chauffeur chauffeur);
    Chauffeur getChauffeurById(Long id);
    Chauffeur updateChauffeur(Chauffeur chauffeur);
    void deleteChauffeur(Long id);

}
