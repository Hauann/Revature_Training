package week2.day3.assignment1;

public class Car extends Vehicle {

    // Additional attribute for Car
    private double insurancePerDay;

    // Constructor calls parent constructor using super()
    public Car(String vehicleNumber, String model,
               double ratePerDay, int days,
               double insurancePerDay) {

        super(vehicleNumber, model, ratePerDay, days);

        this.insurancePerDay = insurancePerDay;
    }

    // Override parent method
    @Override
    public double calculateRent() {

        return (ratePerDay + insurancePerDay) * days;
    }

    // Override parent display method
    @Override
    public void displayDetails() {

        System.out.println(
            "Car  | " + vehicleNumber +
            " | " + model +
            " | Days: " + days +
            " | Rent: " + calculateRent()
        );
    }
}