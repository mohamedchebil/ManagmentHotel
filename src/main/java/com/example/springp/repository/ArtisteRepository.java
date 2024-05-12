package com.example.springp.repository;

import com.example.springp.entity.Artiste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtisteRepository extends JpaRepository<Artiste,Integer> {
    Artiste findByNom(String nom);
}