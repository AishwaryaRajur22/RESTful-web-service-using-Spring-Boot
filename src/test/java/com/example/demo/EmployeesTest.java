package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesTest {

    @Test
    public void testGetEmployeeList() {
        Employees employees = new Employees();
        assertEquals(4, employees.getEmployeeList().size()); // Assuming you added 4 employees
    }
}