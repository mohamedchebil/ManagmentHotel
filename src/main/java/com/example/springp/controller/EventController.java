package com.example.springp.controller;

import com.example.springp.entity.Event;
import com.example.springp.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @PostMapping("/add")
    public Event save(@RequestBody Event event){
        return eventService.save(event);
    }

    @GetMapping
    public List<Event> findAllEvents(){
        return eventService.findAllEvents() ;
    }

    @GetMapping("/{nom}")
    public Event findByNom(@PathVariable String nom){
        return eventService.findByNom(nom);
    }

    @PutMapping("/update")
    public Event update(@RequestBody Event event){
        return eventService.update(event);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        eventService.delete(id);
    }
}
