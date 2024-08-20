import java.io.*;

public class DaysConverter1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input: Total number of days
        System.out.print("Enter the total number of days: ");
        int totalDays = Integer.parseInt(reader.readLine());

        // Close the reader to prevent resource leak
        reader.close();

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