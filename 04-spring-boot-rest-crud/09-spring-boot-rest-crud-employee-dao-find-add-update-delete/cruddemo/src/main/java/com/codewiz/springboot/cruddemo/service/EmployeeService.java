package com.codewiz.springboot.cruddemo.service;

import com.codewiz.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
