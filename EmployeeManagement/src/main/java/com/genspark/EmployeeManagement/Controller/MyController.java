package com.genspark.EmployeeManagement.Controller;

import com.genspark.EmployeeManagement.Entity.Employee;
import com.genspark.EmployeeManagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService x;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1>Welcome to the Employee Management System</H1></HTML>";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return this.x.getAllEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable String id){
        return this.x.getEmployeeById(Integer.parseInt(id));
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.x.addEmployee(employee);
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.x.updateEmployee(employee);
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable String id){
        return this.x.deleteEmployeeById(Integer.parseInt(id));
    }

}
