import java.util.Scanner;

public class NumberOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        double result = calculate(number1, number2);

        if (Double.isNaN(result)) {
            System.out.println("Numbers are not within the specified ranges.");
        } else {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2) {
        if (num1 >= 10 && num1 < 20 && num2 >= 10 && num2 < 20) {
            return num1 + num2;
        } else if (num1 >= 21 && num1 < 30 && num2 >= 21 && num2 < 30) {
            return num1 - num2;
        } else if (num1 > 40 || num2 > 40) {
            return Double.NaN;
        } else {
            return num1 * num2;
        }
    }
}