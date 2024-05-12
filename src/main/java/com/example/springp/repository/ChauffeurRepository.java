package com.example.springp.repository;

import com.example.springp.entity.Chauffeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChauffeurRepository extends JpaRepository<Chauffeur,Long> {
}
