package com.example.springp.repository;

import com.example.springp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentId(Long departmentId);
    @Query(value = "SELECT d.*, COUNT(e.id) AS employee_count FROM department d LEFT JOIN employee e ON d.id = e.department_id GROUP BY d.id ORDER BY employee_count DESC", nativeQuery = true)
    List<Object[]> findDepartmentsByMostEmployees();
    long count();

}
