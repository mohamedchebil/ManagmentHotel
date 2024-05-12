package com.example.springp.service;


import com.example.springp.entity.Event;

import java.util.List;

public interface EventService {

    List<Event> findAllEvents();
    Event findByNom(String nom);
    Event save(Event event);
    Event update(Event event);
    void delete(Integer id);
    long getTotalEvents();
    public List<Object[]> getEventCountByMonth();

}