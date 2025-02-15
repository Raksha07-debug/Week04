package serialisation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


import java.io.*;
import java.util.*;

class EmployeeSerializationTest {


    @Test
    void testDeserializeEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Raksha", "IT", 50000));
        employees.add(new Employee(2, "Muskan", "HR", 60000));
        employees.add(new Employee(3, "Rahul", "Finance", 70000));
        EmployeeSerialization.serializeEmployees(employees);

        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees();

        assertNotNull(deserializedEmployees);
        assertEquals(3, deserializedEmployees.size());

        Employee firstEmployee = deserializedEmployees.get(0);
        assertEquals(1, firstEmployee.getId());
        assertEquals("Raksha", firstEmployee.getName());
        assertEquals("IT", firstEmployee.getDepartment());
        assertEquals(50000, firstEmployee.getSalary());

    }
}
