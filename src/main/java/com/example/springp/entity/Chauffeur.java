package com.example.springp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Chauffeur")
public class Chauffeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "dispo")
    private boolean dispo;

    //constructors
    //no-argument
    public Chauffeur(){

    }

    //argument

    public Chauffeur(String firstName, String lastName, String email, boolean dispo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dispo = dispo;
    }

    //getter and setter

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }
}
