package serialisation;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {
    private static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();employees.add(new Employee(1, "Raksha", "IT", 1000000));employees.add(new Employee(2, "Muskan ", "HR", 60000));employees.add(new Employee(3, "Rahul ", "Finance", 70000));

        serializeEmployees(employees);

        List<Employee> deserializedEmployees = deserializeEmployees();
        if (deserializedEmployees != null) {
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        }
    }

    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized and saved to " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error serializing employees: " + e.getMessage());
        }
    }

    public static List<Employee> deserializeEmployees() {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees deserialized from " + FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error deserializing employees: " + e.getMessage());
        }
        return employees;
    }
}