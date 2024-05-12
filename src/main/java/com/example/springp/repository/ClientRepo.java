package com.example.springp.repository;

import com.example.springp.entity.Client;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client, Long> {

    Client save(Client  client);

    List<Client> findAll();
    Client findClientByUsername(String username);
    Client findClientByEmail(String email);
    long count();

    @Query(value = "SELECT adress, COUNT(adress) AS address_count FROM client GROUP BY adress ORDER BY address_count DESC", nativeQuery = true)
    List<Object[]> findMostSavedAddresses();

}
