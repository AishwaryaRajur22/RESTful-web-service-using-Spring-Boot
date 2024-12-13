package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testGettersAndSetters() {
        Employee employee = new Employee("5", "Alice", "Johnson", "alice.johnson@example.com", "Software Engineer");

        assertEquals("5", employee.getEmployee_id());
        assertEquals("Alice", employee.getFirst_name());
        assertEquals("Johnson", employee.getLast_name());
        assertEquals("alice.johnson@example.com", employee.getEmail());
        assertEquals("Software Engineer", employee.getTitle());
    }
}