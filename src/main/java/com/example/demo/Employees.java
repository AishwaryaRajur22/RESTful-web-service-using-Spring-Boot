package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList=new ArrayList<>();
    public Employees () {
        employeeList.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Manager"));
        employeeList.add(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Developer"));
        employeeList.add(new Employee("3", "Aishwarya", "Rajur", "arajur@ucsc.edu", "Solutions architect"));
        employeeList.add(new Employee("4", "Amogh", "MK", "amoghmkg@gmail.com", "Network Eng"));

    }
    public List <Employee> getEmployeeList() {
        return employeeList;
    }
}
