package com.example.springp.controller;


import com.example.springp.entity.Client;
import com.example.springp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/clients")
public class ClientController {

    private final ClientService clientService;


    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value="/ListClient", produces = "application/json")
    public List<Client> getUsers() {
        return clientService.findAll();
    }

    @PostMapping(path = "/AddUser" )
    public ResponseEntity<Client> save(@RequestBody Client client){
        return  new ResponseEntity<Client>(clientService.save(client), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteClient/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        clientService.delete(id);
        return ResponseEntity.ok("Client removed successfully");
    }










































}
