package com.example.springp.service;

import com.example.springp.entity.Ressource;

import java.util.List;

public interface RessourceService {
    List<Ressource> getAllRessource();

    Ressource CreateRessource(Ressource ressource);
    Ressource getRessourceById(Long id);
    Ressource updateRessoure(Ressource ressource);
    void deleteRessource(Long id);
}
