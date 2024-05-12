package com.example.springp.controller;

import com.example.springp.entity.Ressource;
import com.example.springp.service.serviceImpl.RessourceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RessourceRestController {
    @Autowired
    private RessourceServiceImp ressourceServiceImp;
    @PostMapping("/saveRessource")
    public Ressource SaveRessource(@RequestBody Ressource ressource){
        return ressourceServiceImp.CreateRessource(ressource);
    }
    @GetMapping("/allRessource")
    public List<Ressource> getAllRessource(){
        return ressourceServiceImp.getAllRessource();
    }
    @GetMapping("/getoneRess/{id}")
    public Ressource getOneRessource(@PathVariable Long id){
        return ressourceServiceImp.getRessourceById(id);
    }
    @PutMapping("/updateRess/{id}")
    public Ressource updateRessource(@PathVariable Long id , @RequestBody Ressource ressource){
        Ressource R1=ressourceServiceImp.getRessourceById(id);
        if(R1!=null){
            ressource.setId(id);
            return ressourceServiceImp.updateRessoure(ressource);
        }
        else {
            throw new RuntimeException("Failed");
        }

    }
    @DeleteMapping("/deleteRess/{id}")
    public HashMap<String,String> deleteRessource(@PathVariable Long id){
        HashMap<String,String> message=new HashMap<>();
        if(ressourceServiceImp.getRessourceById(id)==null){
            message.put("etat","ressource not found");
            return message;
        }
        try{
            ressourceServiceImp.deleteRessource(id);
            message.put("etat","ressource deleted");
            return message;
        }catch (Exception e){
            message.put("etat","ressource not deleted");
            return message;
        }
    }
}

