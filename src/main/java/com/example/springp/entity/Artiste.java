package com.example.springp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Artiste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_artiste;

    @Column
    private String nom;

    @Column
    private float cachet;

    @ManyToMany(mappedBy = "artistes")
    private List<Event> events;

    public Artiste() {
    }

    public Artiste(Integer id, String nom, float cachet) {
        this.id_artiste = id;
        this.nom = nom;
        this.cachet = cachet;
    }

    public Integer getId() {
        return id_artiste;
    }

    public void setId(Integer id) {
        this.id_artiste = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getCachet() {
        return cachet;
    }

    public void setCachet(float cachet) {
        this.cachet = cachet;
    }
}

