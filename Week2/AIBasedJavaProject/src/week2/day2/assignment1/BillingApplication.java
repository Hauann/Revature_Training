package week2.day2.assignment1;

import java.util.Scanner;

public class BillingApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		String customerName = scanner.nextLine();

		System.out.print("Enter product name: ");
		String productName = scanner.nextLine();

		System.out.print("Enter product price: Rs. ");
		double productPrice = scanner.nextDouble();

		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();

		double totalAmount = productPrice * quantity;
		double discountAmount = calculateDiscount(totalAmount);
		double finalAmount = totalAmount - discountAmount;

		printBill(customerName, productName, totalAmount,
				discountAmount, finalAmount);

		scanner.close();
	}

	public static double calculateDiscount(double totalAmount) {
		double discountPercentage = 0.0;

		// Apply 10% discount for purchases of Rs. 5000 or more.
		if (totalAmount >= 5000.0) {
			discountPercentage = 10.0;
		}
		// Apply 5% discount for purchases between Rs. 1000 and Rs. 4999.
		else if (totalAmount >= 1000.0) {
			discountPercentage = 5.0;
		}

		// Convert the percentage into the discount amount in rupees.
		double discountAmount =
				totalAmount * discountPercentage / 100.0;

		return discountAmount;
	}

	public static void printBill(String customerName, String productName,
			double totalAmount, double discountAmount,
			double finalAmount) {

		double discountPercentage = 0.0;

		if (discountAmount > 0.0) {
			discountPercentage =
					(discountAmount * 100.0) / totalAmount;
		}

		System.out.println("\n----- SmartStore Bill -----");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Product Name: " + productName);
		System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
		System.out.printf("Discount Percentage: %.2f%%%n",
				discountPercentage);
		System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
		System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);
	}
}
