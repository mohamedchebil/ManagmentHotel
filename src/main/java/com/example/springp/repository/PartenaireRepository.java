package com.example.springp.repository;

import com.example.springp.entity.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartenaireRepository extends JpaRepository<Partenaire,Integer> {
    Partenaire findByNom(String nom);
}