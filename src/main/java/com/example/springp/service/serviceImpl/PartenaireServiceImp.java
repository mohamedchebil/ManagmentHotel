package com.example.springp.service.serviceImpl;

import com.example.springp.entity.Partenaire;
import com.example.springp.repository.PartenaireRepository;
import com.example.springp.service.PartenaireService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartenaireServiceImp implements PartenaireService {

    private final PartenaireRepository partenaireRepository;

    public PartenaireServiceImp(PartenaireRepository partenaireRepository) {
        this.partenaireRepository = partenaireRepository;
    }

    @Override
    public List<Partenaire> findAllPartenaires() {
        return partenaireRepository.findAll();
    }

    @Override
    public Partenaire findByNom(String nom) {
        return partenaireRepository.findByNom(nom);
    }

    @Override
    public Partenaire save(Partenaire partenaire) {
        return partenaireRepository.save(partenaire);
    }

    @Override
    public Partenaire update(Partenaire partenaire) {
        return partenaireRepository.save(partenaire);
    }

    @Override
    public void delete(Integer id) {
        partenaireRepository.deleteById(id);
    }
}

