package com.example.springp.controller;

import com.example.springp.entity.Chauffeur;
import com.example.springp.service.serviceImpl.ChauffeurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class ChauffeurController {
    @Autowired
    private ChauffeurServiceImpl chauffeurServiceImp;

    @PostMapping("/chauffeursave")
    public Chauffeur SaveChauffeur(@RequestBody Chauffeur chauffeur){
        return chauffeurServiceImp.CreateChauffeur(chauffeur);
    }

    @GetMapping("/allchauffeur")
    public List<Chauffeur> getAllChauffeur(){
        return chauffeurServiceImp.getAllChauffeur();
    }
    @GetMapping("/getonechauffeur/{id}")
    public Chauffeur getOneChauffeur(@PathVariable Long id){
        return chauffeurServiceImp.getChauffeurById(id);
    }
    @PutMapping("/updatechauffeur/{id}")
    public Chauffeur updateChauffeur(@PathVariable Long id , @RequestBody Chauffeur chauffeur){
        Chauffeur c1=chauffeurServiceImp.getChauffeurById(id);
        if(c1!=null){
            chauffeur.setId(id.intValue());
            return chauffeurServiceImp.updateChauffeur(chauffeur);
        }
        else {
            throw new RuntimeException("Failed");
        }

    }
    @DeleteMapping("/deletechauffeur/{id}")
    public HashMap<String,String> deleteChauffeur(@PathVariable Long id){
        HashMap<String,String> message=new HashMap<>();
        if(chauffeurServiceImp.getChauffeurById(id)==null){
            message.put("etat","chauffeur not found");
            return message;
        }
        try{
            chauffeurServiceImp.deleteChauffeur(id);
            message.put("etat","chauffeur deleted");
            return message;
        }catch (Exception e){
            message.put("etat","chauffeur not deleted");
            return message;
        }
    }
}
