package com.example.springp.service;


import com.example.springp.entity.Chambre;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ChambreService {



    Chambre save(Chambre chambre);
    List<Chambre> findAll() ;
    //Chambre update(Chambre chambre);
    Chambre findChambreByNumero(String Numero);
    Optional<Chambre> findById(Long aLong);



}
