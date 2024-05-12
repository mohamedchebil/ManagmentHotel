package com.example.springp.service;


import com.example.springp.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {

    Reservation save(Reservation reservation);
    public void reserver(Reservation reservation);
    List<Reservation> findall() ;
    Optional<Reservation> findById(Long id);








}
