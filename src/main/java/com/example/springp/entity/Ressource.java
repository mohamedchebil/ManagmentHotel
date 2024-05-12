package com.example.springp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Ressource")
public class Ressource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "nombre")
    private int nombre;
    //constructors
    //no-argument
    public Ressource(){

    }

    //argument

    public Ressource(Long id, String name, int nombre) {
        this.id = id;
        this.name = name;
        this.nombre = nombre;
    }
    //getter and setter

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNombre() {
        return nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
