package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private Employees employees = new Employees(); // Manages the list of employees

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employees.getEmployeeList(); // Fetches the list of employees
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee newEmployee) {
        employees.getEmployeeList().add(newEmployee); // Adds the new employee to the list
    }
}
