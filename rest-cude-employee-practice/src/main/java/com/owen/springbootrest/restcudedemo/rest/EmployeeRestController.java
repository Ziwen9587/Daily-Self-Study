package com.owen.springbootrest.restcudedemo.rest;

import com.owen.springbootrest.restcudedemo.dao.EmployeeDAO;
import com.owen.springbootrest.restcudedemo.entity.Employee;
import com.owen.springbootrest.restcudedemo.service.EmployeeService;
import com.owen.springbootrest.restcudedemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return this.employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return this.employeeService.findById(id);
    }

}
