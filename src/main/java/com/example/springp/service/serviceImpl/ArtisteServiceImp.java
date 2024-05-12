package com.example.springp.service.serviceImpl;

import com.example.springp.entity.Artiste;
import com.example.springp.repository.ArtisteRepository;
import com.example.springp.service.ArtisteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtisteServiceImp implements ArtisteService {
    private final ArtisteRepository artisteRepository;

    public ArtisteServiceImp(ArtisteRepository artisteRepository) {
        this.artisteRepository = artisteRepository;
    }

    @Override
    public List<Artiste> findAllArtistes() {
        return artisteRepository.findAll();
    }

    @Override
    public Artiste findByNom(String nom) {
        return artisteRepository.findByNom(nom);
    }

    @Override
    public Artiste save(Artiste artiste) {
        return artisteRepository.save(artiste);
    }

    @Override
    public Artiste update(Artiste artiste) {
        return artisteRepository.save(artiste);
    }

    @Override
    public void delete(Integer id) {
        artisteRepository.deleteById(id);
    }
}
