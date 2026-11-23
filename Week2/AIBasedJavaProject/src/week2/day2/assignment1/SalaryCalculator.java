package week2.day2.assignment1;

import java.util.Scanner;

public class SalaryCalculator {

    // Calculate HRA (20% of basic salary)
    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    // Calculate DA (10% of basic salary)
    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    // Calculate gross salary
    public static double calculateGross(
            double basicSalary, double hra, double da) {

        return basicSalary + hra + da;
    }

    // Calculate professional tax
    public static double calculateProfessionalTax(
            double grossSalary) {

        if (grossSalary > 20000) {
            return 200;
        }

        return 0;
    }

    // Calculate net salary
    public static double calculateNetSalary(
            double grossSalary, double tax) {

        return grossSalary - tax;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Accept employee details
        System.out.print("Enter Employee ID: ");
        String employeeID = scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Validate basic salary
        if (basicSalary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            scanner.close();
            return;
        }

        // Calculate salary components
        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);

        double grossSalary = calculateGross(
                basicSalary, hra, da);

        double professionalTax =
                calculateProfessionalTax(grossSalary);

        double netSalary =
                calculateNetSalary(grossSalary, professionalTax);

        // Display employee salary details
        System.out.println("\n===== EMPLOYEE SALARY DETAILS =====");

        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);

        System.out.printf("Basic Salary: ₹%.2f%n", basicSalary);
        System.out.printf("HRA (20%%): ₹%.2f%n", hra);
        System.out.printf("DA (10%%): ₹%.2f%n", da);
        System.out.printf("Gross Salary: ₹%.2f%n", grossSalary);

        System.out.printf(
                "Professional Tax: ₹%.2f%n", professionalTax);

        System.out.printf("Net Salary: ₹%.2f%n", netSalary);

        scanner.close();
    }
}