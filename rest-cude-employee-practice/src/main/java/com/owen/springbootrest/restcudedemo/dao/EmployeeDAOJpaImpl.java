package com.owen.springbootrest.restcudedemo.dao;

import com.owen.springbootrest.restcudedemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // Define field for entity manager
    private EntityManager entityManager;
    // Inject entity manager object
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }
    @Override
    public Employee findById(int id){
        Employee employee = this.entityManager.find(Employee.class, id);
        return employee;
    }
    @Override
    public Employee save(Employee employee){
        Employee resultEmployee = this.entityManager.merge(employee);
        return resultEmployee;
    }
    @Override
    public void deleteById(int id){
        Employee employee = this.entityManager.find(Employee.class, id);
        this.entityManager.remove(employee);
    }
}
