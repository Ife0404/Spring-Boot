package com.codewiz.springboot.cruddemo.dao;

import com.codewiz.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {


    List<Employee> findAll();
}
