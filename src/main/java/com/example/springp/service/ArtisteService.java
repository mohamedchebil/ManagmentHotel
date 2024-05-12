package com.example.springp.service;

import com.example.springp.entity.Artiste;

import java.util.List;

public interface ArtisteService {

    List<Artiste> findAllArtistes();
    Artiste findByNom(String nom);
    Artiste save(Artiste artiste);
    Artiste update(Artiste artiste);
    void delete(Integer id);
}

