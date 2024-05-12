package com.example.springp.controller;


import com.example.springp.entity.Chambre;
import com.example.springp.service.ChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/chambres")
public class ChambreController {


   private final ChambreService chambreService;

    public ChambreController(ChambreService chambreService) {
        this.chambreService = chambreService;
    }


    @GetMapping(value="/ListChambre",produces = "application/json")
    public List<Chambre> getAll() {
        return chambreService.findAll();
    }

    @PostMapping(path = "/AddChambre" )
    public ResponseEntity<Chambre> save(@RequestBody Chambre chambre){
        return  new ResponseEntity<Chambre>(chambreService.save(chambre), HttpStatus.CREATED);
    }


  /*  @PutMapping("/updatechambre/{id}")
    public Chambre update(@PathVariable Long id , @RequestBody Chambre chambre){
            chambre.setId(id.intValue());
            return chambreService.update(chambre);

    }*/




































}
