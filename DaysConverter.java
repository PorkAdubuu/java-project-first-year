import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Total number of days
        System.out.print("Enter the total number of days: ");
        int totalDays = scanner.nextInt();


        // Convert days to years, months, weeks, and days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        remainingDays %= 30;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        // Display the result
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}