package com.example.springp.repository;

import com.example.springp.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {

    Reservation save(Reservation chambre);
    List<Reservation> findAll();
    Optional<Reservation> findById(Long id);







}
