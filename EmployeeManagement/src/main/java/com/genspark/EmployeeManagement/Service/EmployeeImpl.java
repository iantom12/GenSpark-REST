package com.genspark.EmployeeManagement.Service;

import com.genspark.EmployeeManagement.Dao.EmployeeDao;
import com.genspark.EmployeeManagement.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeService{
    @Autowired
    private EmployeeDao dao;


    @Override
    public List<Employee> getAllEmployees() {
        return this.dao.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> e = this.dao.findById(id);
        Employee x;
        if(e.isPresent()){
            x = e.get();
        }else{
            throw new RuntimeException("Employee not found for id :: "+ id);
        }
        return x;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.dao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.dao.save(employee);
    }

    @Override
    public String deleteEmployeeById(int id) {
        this.dao.deleteById(id);
        return"Deleted successfully, good job!";
    }
}
