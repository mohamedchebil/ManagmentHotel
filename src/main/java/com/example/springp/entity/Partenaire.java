package com.example.springp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Partenaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_partenaire;
    @Column
    private String nom;
    @Column
    private float argent_fourni;

    @ManyToMany(mappedBy = "partenaires")
    private List<Event> events;

    public Partenaire() {
    }
    public Partenaire(Integer id, String nom, float argent_fourni) {
        this.id_partenaire = id;
        this.nom = nom;
        this.argent_fourni = argent_fourni;
    }

    public Integer getId() {
        return id_partenaire;
    }

    public void setId(Integer id) {
        this.id_partenaire = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getArgent_fourni() {
        return argent_fourni;
    }

    public void setArgent_fourni(float argent_fourni) {
        this.argent_fourni = argent_fourni;
    }
}
