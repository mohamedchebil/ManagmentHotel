package com.example.springp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_event;
    @Column
    private String nom;
    @Column
    private float budget;

    @Column
    private LocalDate date;

    @ManyToMany
    @JoinTable(name="artiste_event",
            joinColumns = @JoinColumn(name = "id_event"),
            inverseJoinColumns = @JoinColumn(name = "id_artiste"))
    private List<Artiste> artistes;

    @ManyToMany
    @JoinTable(name="partenaire_event",
            joinColumns = @JoinColumn(name = "id_event"),
            inverseJoinColumns = @JoinColumn(name = "id_partenaire"))
    private List<Partenaire> partenaires;

    public Event() {
    }

    public Event(Integer id, String nom, float budget, LocalDate date) {
        this.id_event = id;
        this.nom = nom;
        this.budget = budget;
        this.date = date;
    }

    public Integer getId() {
        return id_event;
    }

    public void setId(Integer id) {
        this.id_event = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}

