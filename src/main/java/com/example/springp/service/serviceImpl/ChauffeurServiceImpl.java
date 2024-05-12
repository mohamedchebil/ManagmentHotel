package com.example.springp.service.serviceImpl;

import com.example.springp.entity.Chauffeur;
import com.example.springp.repository.ChauffeurRepository;
import com.example.springp.service.ChauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChauffeurServiceImpl implements ChauffeurService {
    @Autowired
    private ChauffeurRepository chauffeurRepository;


    @Override
    public List<Chauffeur> getAllChauffeur() {
        return chauffeurRepository.findAll() ;
    }

    @Override
    public Chauffeur CreateChauffeur(Chauffeur chauffeur) {
        return chauffeurRepository.save(chauffeur);
    }

    @Override
    public Chauffeur getChauffeurById(Long id) {
        return chauffeurRepository.findById(id).get();
    }

    @Override
    public Chauffeur updateChauffeur(Chauffeur chauffeur) {
        return chauffeurRepository.saveAndFlush(chauffeur);
    }

    @Override
    public void deleteChauffeur(Long id) {
        chauffeurRepository.deleteById(id);

    }
}
