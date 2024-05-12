package com.example.springp.controller;

import com.example.springp.entity.Artiste;
import com.example.springp.service.ArtisteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/artistes")
public class ArtisteController {

    private final ArtisteService artisteService;

    public ArtisteController(ArtisteService artisteService) {
        this.artisteService = artisteService;
    }

    @GetMapping
    public List<Artiste> findAllArtistes() {
        return artisteService.findAllArtistes();
    }

    @GetMapping("/{nom}")
    public Artiste findByNom(@PathVariable String nom) {
        return artisteService.findByNom(nom);
    }

    @PostMapping("/add")
    public Artiste save(@RequestBody Artiste artiste) {
        return artisteService.save(artiste);
    }

    @PutMapping("/update")
    public Artiste update(@RequestBody Artiste artiste) {
        return artisteService.update(artiste);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        artisteService.delete(id);
    }
}
