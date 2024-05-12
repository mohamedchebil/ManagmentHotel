package com.example.springp.service;

import com.example.springp.entity.Partenaire;

import java.util.List;

public interface PartenaireService {
    List<Partenaire> findAllPartenaires();
    Partenaire findByNom(String nom);
    Partenaire save(Partenaire partenaire);
    Partenaire update(Partenaire partenaire);
    void delete(Integer id);
}
