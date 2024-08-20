package com.codewiz.springboot.cruddemo.service;

import com.codewiz.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    // Get a single employee
    Employee findById(int theId);

    // Add or Update employee
    Employee save(Employee theEmployee);

    // delete an existing employee
    void deleteById(int theId);

}
