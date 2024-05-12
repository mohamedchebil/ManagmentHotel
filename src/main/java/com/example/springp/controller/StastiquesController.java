package com.example.springp.controller;




import com.example.springp.service.ClientService;
import com.example.springp.service.EmployeeService;
import com.example.springp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/stats")
public class StastiquesController {
    @Autowired
    private EventService eventService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/counts")
    public Map<String, Long> getStatisticsCounts() {
        Map<String, Long> statisticsMap = new HashMap<>();
        statisticsMap.put("eventCount", eventService.getTotalEvents());
        statisticsMap.put("clientCount", clientService.getTotalClients());
        statisticsMap.put("employeeCount", employeeService.getTotalEmployees());
        return statisticsMap;
    }

    @GetMapping("/most-saved-client-adrs")
    public List<Object[]> getMostSavedAddresses() {
        return clientService.getMostSavedAddresses();
    }

    @GetMapping("/dept-most-employees")
    public List<Object[]> getDepartmentsByMostEmployees() {
        return employeeService.getDepartmentsByMostEmployees();
    }

    @GetMapping("/event-count-by-month")
    public List<Object[]> getEventCountByMonth() {
        return eventService.getEventCountByMonth();
    }
}

