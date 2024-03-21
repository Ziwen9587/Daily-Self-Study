package com.owen.springbootrest.restcudedemo.service;

import com.owen.springbootrest.restcudedemo.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee  employee);
    void deleteById(int id);
}
