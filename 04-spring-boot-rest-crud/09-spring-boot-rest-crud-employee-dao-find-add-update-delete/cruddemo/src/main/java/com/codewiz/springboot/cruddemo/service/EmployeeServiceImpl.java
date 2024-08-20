package com.codewiz.springboot.cruddemo.service;

import com.codewiz.springboot.cruddemo.dao.EmployeeDAO;
import com.codewiz.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    // define field for employeeDAO
    private EmployeeDAO employeeDAO;

    // set up constructors injection
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployerDAO) {
        employeeDAO = theEmployerDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

}
