package com.example.springp.service.serviceImpl;

import com.example.springp.entity.Ressource;
import com.example.springp.repository.RessourceRepository;
import com.example.springp.service.RessourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RessourceServiceImp implements RessourceService {
    @Autowired
    private RessourceRepository ressourceRepository;
    @Override
    public List<Ressource> getAllRessource() {
        return ressourceRepository.findAll();
    }

    @Override
    public Ressource CreateRessource(Ressource ressource) {
        return ressourceRepository.save(ressource);
    }

    @Override
    public Ressource getRessourceById(Long id) {
        return ressourceRepository.findById(id).get();
    }

    @Override
    public Ressource updateRessoure(Ressource ressource) {
        return ressourceRepository.saveAndFlush(ressource);
    }

    @Override
    public void deleteRessource(Long id) {
        ressourceRepository.deleteById(id);

    }
}
