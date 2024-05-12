package com.example.springp.repository;


import com.example.springp.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



public interface ChambreRepo extends JpaRepository<Chambre, Long> {

    Chambre save(Chambre chambre);
    List<Chambre> findAll() ;
    Chambre findChambreByNumero(String Numero);

    //Chambre update(Chambre chambre);

    Optional<Chambre> findById(Long aLong);
}
