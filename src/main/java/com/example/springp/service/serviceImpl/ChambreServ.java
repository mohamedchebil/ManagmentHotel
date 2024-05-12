package com.example.springp.service.serviceImpl;


import com.example.springp.entity.Chambre;
import com.example.springp.repository.ChambreRepo;
import com.example.springp.service.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreServ implements ChambreService {

    @Autowired
    ChambreRepo chambreRepo ;

    public ChambreServ(ChambreRepo chambreRepo) {
        this.chambreRepo = chambreRepo;
    }


    @Override
    public Chambre save(Chambre chambre) {
        return chambreRepo.save(chambre);
    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepo.findAll();
    }

   /* @Override
    public Chambre update(Chambre chambre) {
        return chambreRepo.saveAndFlush(chambre);
    }*/

    @Override
    public Chambre findChambreByNumero(String Numero) {
        return chambreRepo.findChambreByNumero(Numero);
    }

    @Override
    public Optional<Chambre> findById(Long aLong) {
        return chambreRepo.findById(aLong);
    }


}
