package com.example.springp.controller;

import com.example.springp.entity.Partenaire;
import com.example.springp.service.PartenaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partenaires")
public class PartenaireController {
    private final PartenaireService partenaireService;

    public PartenaireController(PartenaireService partenaireService) {
        this.partenaireService = partenaireService;
    }

    @GetMapping
    public List<Partenaire> findAllPartenaires(){
        return partenaireService.findAllPartenaires();
    }

    @GetMapping("/{nom}")
    public Partenaire findByNom(@PathVariable String nom){
        return partenaireService.findByNom(nom);
    }

    @PostMapping("/add")
    public Partenaire save(@RequestBody Partenaire partenaire){
        return partenaireService.save(partenaire);
    }

    @PutMapping("/update")
    public Partenaire update(@RequestBody Partenaire partenaire){
        return partenaireService.update(partenaire);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        partenaireService.delete(id);
    }
}

