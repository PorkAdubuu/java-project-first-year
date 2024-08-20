import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the meal price from the user
        System.out.print("Enter the meal price: $");
        double mealPrice = scanner.nextDouble();

        // Get the payment amount from the user
        System.out.print("Enter the payment amount: $");
        double payment = scanner.nextDouble();

        // Calculate the change
        double change = calculateChange(mealPrice, payment);

        // Display the change
        System.out.println("Change: $" + change);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }

    // Method to calculate the change
    private static double calculateChange(double mealPrice, double payment) {
        if (payment < mealPrice) {
            System.out.println("Insufficient payment. Please provide enough money.");
            System.exit(0); // Terminate the program
        }

        return payment - mealPrice;
    }
}