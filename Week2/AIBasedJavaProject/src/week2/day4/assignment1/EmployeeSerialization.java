package week2.day4.assignment1;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class EmployeeSerialization {

    public static void main(String[] args) {

        // Array of 5 Employee objects
        Employee[] employees = {
            new Employee(101, "John", "IT", 50000),
            new Employee(102, "Alice", "HR", 45000),
            new Employee(103, "David", "Finance", 55000),
            new Employee(104, "Emma", "Marketing", 48000),
            new Employee(105, "Michael", "Sales", 52000)
        };

        // Write Employee array
        try {
            FileOutputStream fos =
                new FileOutputStream("employees.dat");

            ObjectOutputStream oos =
                new ObjectOutputStream(fos);

            oos.writeObject(employees);

            oos.close();
            fos.close();

            System.out.println("Employee objects saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read Employee array
        try {
            FileInputStream fis =
                new FileInputStream("employees.dat");

            ObjectInputStream ois =
                new ObjectInputStream(fis);

            Employee[] retrievedEmployees =
                (Employee[]) ois.readObject();

            System.out.println("\nRetrieved Employee Details:");

            // Display employee details
            for (Employee emp : retrievedEmployees) {
                System.out.println(emp);
            }

            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}