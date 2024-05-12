package com.example.springp.service.serviceImpl;

import com.example.springp.entity.Event;
import com.example.springp.repository.EventRepository;
import com.example.springp.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImp implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImp(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event findByNom(String nom) {
        return eventRepository.findByNom(nom);
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event update(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public void delete(Integer id) {
        eventRepository.deleteById(id);
    }
    @Override
    public long getTotalEvents() {
        return eventRepository.count();
    }
    @Override
    public List<Object[]> getEventCountByMonth() {
        return eventRepository.findEventCountByMonth();
    }
}
