package com.example.springp.service.serviceImpl;


import com.example.springp.entity.Reservation;
import com.example.springp.repository.ReservationRepo;
import com.example.springp.service.ChambreService;
import com.example.springp.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ReservationServ implements ReservationService {

    final
    ReservationRepo reservationRepo;

    @Autowired
    ChambreService chambreService;

    public ReservationServ(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }


    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public Optional<Reservation> findById(Long id) {
        return reservationRepo.findById(id);
    }

    @Override
    public void reserver(Reservation reservation) {
        if (reservation.getChambre().isOccupee()==false)
        {

            chambreService.findById(reservation.getChambre().getId());
            System.out.println(reservation.getChambre().getId());

            reservation.getChambre().setOccupee(true);



            reservationRepo.save(reservation);
        }
    }

    @Override
    public List<Reservation> findall() {
        return reservationRepo.findAll();
    }




}
