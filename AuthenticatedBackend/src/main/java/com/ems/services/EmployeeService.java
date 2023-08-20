package com.ems.services;

import java.util.List;

import com.ems.models.Employee;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
    
}
