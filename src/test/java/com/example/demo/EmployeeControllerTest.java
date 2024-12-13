package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.List;

@SpringBootTest
public class EmployeeControllerTest {

    private MockMvc mockMvc;

    @Mock
    private Employees employees;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    public void testGetEmployees() throws Exception {
        when(employees.getEmployeeList()).thenReturn(List.of(new Employee("1", "John", "Doe", "john.doe@example.com", "Manager")));

        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(1)) // Verify one employee in the list
                .andExpect(jsonPath("$[0].employee_id").value("1"));
    }

    @Test
    public void testAddEmployee() throws Exception {
        String newEmployeeJson = "{\"employee_id\": \"5\", \"first_name\": \"Alice\", \"last_name\": \"Johnson\", \"email\": \"alice.johnson@example.com\", \"title\": \"Software Engineer\"}";

        mockMvc.perform(post("/employees")
                .contentType("application/json")
                .content(newEmployeeJson))
                .andExpect(status().isOk());
    }
}
