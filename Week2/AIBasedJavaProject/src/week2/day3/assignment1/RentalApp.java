package week2.day3.assignment1;

import java.util.Scanner;

public class RentalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask how many vehicles are being rented
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        // Polymorphism: Parent class array stores child objects
        Vehicle[] vehicles = new Vehicle[n];

        // Read information for each vehicle
        for (int i = 0; i < n; i++) {

            int type;

            // Repeat until a valid vehicle type is entered
            while (true) {

                System.out.print(
                    "\nEnter type (1-Car, 2-Bike): "
                );

                type = sc.nextInt();

                if (type == 1 || type == 2) {
                    break;
                }

                System.out.println(
                    "Invalid vehicle type! Please enter 1 or 2."
                );
            }

            sc.nextLine(); // Consume newline

            System.out.print("Enter Vehicle Number: ");
            String vehicleNumber = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Rate per Day: ");
            double ratePerDay = sc.nextDouble();

            System.out.print("Enter Days: ");
            int days = sc.nextInt();

            // Create Car or Bike object
            if (type == 1) {

                System.out.print("Enter Insurance per Day: ");
                double insurance = sc.nextDouble();

                // Parent reference points to Car object
                vehicles[i] = new Car(
                    vehicleNumber,
                    model,
                    ratePerDay,
                    days,
                    insurance
                );

            } else {

                // Parent reference points to Bike object
                vehicles[i] = new Bike(
                    vehicleNumber,
                    model,
                    ratePerDay,
                    days
                );
            }
        }

        // Display rental details
        System.out.println("\n--- Rental Details ---");

        double totalRent = 0;

        for (int i = 0; i < n; i++) {

            // Runtime polymorphism:
            // Java calls the overridden method of each object
            vehicles[i].displayDetails();

            totalRent += vehicles[i].calculateRent();
        }

        // Display total rental amount
        System.out.println(
            "\nTotal Rent Collected: " + totalRent
        );

        // Close Scanner
        sc.close();
    }
}