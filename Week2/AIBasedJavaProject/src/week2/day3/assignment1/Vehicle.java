package week2.day3.assignment1;

public class Vehicle {

    // Common attributes for all vehicles
    protected String vehicleNumber;
    protected String model;
    protected double ratePerDay;
    protected int days;

    // Parent constructor
    public Vehicle(String vehicleNumber, String model,
                   double ratePerDay, int days) {

        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.ratePerDay = ratePerDay;
        this.days = days;
    }

    // Calculate basic rental amount
    public double calculateRent() {
        return ratePerDay * days;
    }

    // Display vehicle information
    public void displayDetails() {

        System.out.println(
            "Vehicle | " + vehicleNumber +
            " | " + model +
            " | Days: " + days +
            " | Rent: " + calculateRent()
        );
    }
}