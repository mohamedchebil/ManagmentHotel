package com.example.springp.entity;



import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    public Chambre(long id, String numero, String type, int capacite, boolean occupee) {
        this.id = id;
        this.numero = numero;
        this.type = type;
        this.capacite = capacite;
        this.occupee = occupee;
    }

    public Chambre() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isOccupee() {
        return occupee;
    }

    public void setOccupee(boolean occupee) {
        this.occupee = occupee;
    }

    private String numero;
    private String type;
    private int capacite;
    private boolean occupee;





}
