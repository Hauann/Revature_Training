package week2.day3.assignment1;

public class Bike extends Vehicle {

    // Constructor calls parent constructor using super()
    public Bike(String vehicleNumber, String model,
                double ratePerDay, int days) {

        super(vehicleNumber, model, ratePerDay, days);
    }

    // Override parent method
    @Override
    public double calculateRent() {

        double totalRent = ratePerDay * days;

        return totalRent - (totalRent * 0.10);
    }

    // Override parent display method
    @Override
    public void displayDetails() {

        System.out.println(
            "Bike | " + vehicleNumber +
            " | " + model +
            " | Days: " + days +
            " | Rent: " + calculateRent()
        );
    }
}