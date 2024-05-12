package com.example.springp.service;



import com.example.springp.entity.Client;

import java.util.List;
import java.util.Optional;


public interface ClientService {


    public Client save(Client client) ;


    public List<Client> findAll();

    public void delete(Long id);

    public Client findClientByUsername(String username) ;

    public Client findClientByEmail(String email);
    long getTotalClients();
    public List<Object[]> getMostSavedAddresses() ;

}
