package com.example.springp.service;

import com.example.springp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
    long getTotalEmployees();
    public List<Object[]> getDepartmentsByMostEmployees();

}
