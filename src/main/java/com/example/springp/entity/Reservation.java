package com.example.springp.entity;



import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    private Date dateRes;
    private Date dateRetour;

    private float cout;

    @ManyToOne
    @JoinColumn
    private Client client;

    @ManyToOne
    @JoinColumn
    private Chambre chambre;


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Reservation() {

    }


    public long getId() {
        return id;
    }

    public Date getDateRes() {
        return dateRes;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public float getCout() {
        return cout;
    }

    public Reservation(long id, Date dateRes, Date dateRetour, float cout) {
        this.id = id;
        this.dateRes = dateRes;
        this.dateRetour = dateRetour;
        this.cout = cout;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", dateRes=" + dateRes +
                ", dateRetour=" + dateRetour +
                ", cout=" + cout +
                '}';
    }
}
