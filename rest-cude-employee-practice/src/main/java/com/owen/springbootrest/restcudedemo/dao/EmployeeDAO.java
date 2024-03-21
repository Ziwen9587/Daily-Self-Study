package com.owen.springbootrest.restcudedemo.dao;

import com.owen.springbootrest.restcudedemo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee  employee);
    void deleteById(int id);
}
