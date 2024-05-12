package com.example.springp.controller;



import com.example.springp.entity.Reservation;
import com.example.springp.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin/reservations")
public class ReservationController {

    public final ReservationService reservationService;





    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @PostMapping(path = "/AddReservation" )
    public ResponseEntity<Reservation> save(@RequestBody Reservation reservation){
        return  new ResponseEntity<Reservation>(reservationService.save(reservation), HttpStatus.CREATED);
    }


    @PostMapping("/reserverChambre")
    public ResponseEntity<String> reserverChambre(@RequestBody Reservation reservation) {

        reservationService.reserver(reservation);
        reservationService.save(reservation);

            return new ResponseEntity<String>("La chambre a été réservée avec succès.", HttpStatus.CREATED);

    }



    @GetMapping(value="/ListReservation", produces = "application/json")
    public List<Reservation> getUsers() {
        return reservationService.findall();
    }

    @GetMapping(value="/ReservationByID/{id}", produces = "application/json")
    public Optional<Reservation> getReservation(@PathVariable("id") long id) {
        return reservationService.findById(id);
    }















}
