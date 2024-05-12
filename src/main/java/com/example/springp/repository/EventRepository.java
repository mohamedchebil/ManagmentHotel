package com.example.springp.repository;

import com.example.springp.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventRepository extends JpaRepository<Event,Integer> {
    Event findByNom(String nom);
    long count();
    @Query(value = "SELECT m.month AS month, COUNT(e.id_event) AS eventCount " +
            "FROM (SELECT 'January' AS month UNION SELECT 'February' UNION SELECT 'March' UNION SELECT 'April' " +
            "UNION SELECT 'May' UNION SELECT 'June' UNION SELECT 'July' UNION SELECT 'August' UNION SELECT 'September' " +
            "UNION SELECT 'October' UNION SELECT 'November' UNION SELECT 'December') m " +
            "LEFT JOIN event e ON m.month = MONTHNAME(e.date) " +
            "GROUP BY m.month " +
            "ORDER BY FIELD(m.month, 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December')", nativeQuery = true)
    List<Object[]> findEventCountByMonth();

}

