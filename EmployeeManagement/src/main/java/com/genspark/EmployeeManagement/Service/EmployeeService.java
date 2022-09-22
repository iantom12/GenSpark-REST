package com.genspark.EmployeeManagement.Service;

import com.genspark.EmployeeManagement.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int id);

}
