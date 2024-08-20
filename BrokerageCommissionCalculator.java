import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrokerageCommissionCalculator {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Enter 'S' for sale, 'P' for purchase, or 'Q' to quit:");
                String transactionType = reader.readLine().toUpperCase();

                if (transactionType.equals("Q")) {
                    break;
                }

                System.out.println("Enter the amount of the transaction:");
                double amount = Double.parseDouble(reader.readLine());

                System.out.println("Enter 'E' for commodity exchange, 'C' for New York Cotton Exchange, or 'M' for Mercantile Exchange:");
                char exchange = reader.readLine().toUpperCase().charAt(0);

                double commissionRate = 0;

                if (transactionType.equals("S")) {
                    if (exchange == 'E') {
                        commissionRate = 0.05;
                    } else if (exchange == 'C') {
                        commissionRate = 0.0375;
                    } else if (exchange == 'M') {
                        commissionRate = 0.042;
                    }
                } else if (transactionType.equals("P")) {
                    if (exchange == 'E') {
                        commissionRate = 0.063;
                    } else if (exchange == 'C') {
                        commissionRate = 0.043;
                    } else if (exchange == 'M') {
                        commissionRate = 0.057;
                    }
                } else {
                    System.out.println("Invalid transaction type. Please enter 'S' for sale or 'P' for purchase.");
                    continue;
                }

                double commission = amount * commissionRate;
                System.out.println("The commission for this transaction is: $" + commission);

            } catch (IOException | NumberFormatException e) {
                System.out.println("Error reading input. Please try again.");
            }
        }

        System.out.println("Program terminated.");
    }
}
