package com.codewiz.springboot.cruddemo.dao;

import com.codewiz.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    // Get all employees
    List<Employee> findAll();

    // Get a single employee
    Employee findById(int theId);

    // Add or Update employee
    Employee save(Employee theEmployee);

    // delete an existing employee
    void deleteById(int theId);

}
