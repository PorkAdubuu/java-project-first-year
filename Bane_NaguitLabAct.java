import java.io.*;

public class Bane_NaguitLabAct {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("BROKERAGE COMMISSION CALCULATOR");

        System.out.print("(S) SALE OR (P) PURCHASE: ");
        String input = reader.readLine().toUpperCase();

        if (!(input.equals("S") || input.equals("P"))) {
            System.out.println("Invalid transaction type. Please enter 'S' for sale or 'P' for purchase.");
            return;
        }

        System.out.print("Amount of transaction: ");
        String amount = reader.readLine();

        double inputAmount;
        try {
            inputAmount = Double.parseDouble(amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a valid numerical value.");
            return;
        }

        System.out.println("(E/e) Commodity Exchange");
        System.out.println("(C/c) New York Cotton Exchange");
        System.out.println("(M/m) Mercantile Exchange");

        System.out.print("Where transaction happens: ");
        char commodity = reader.readLine().toUpperCase().charAt(0);

        double commissionRate = 0;

        if (input.equals("S")) {
            if (commodity == 'E') {
                commissionRate = 0.05;
            } else if (commodity == 'C') {
                commissionRate = 0.0375;
            } else if (commodity == 'M') {
                commissionRate = 0.042;
            } else {
                System.out.println("Invalid commodity exchange. Please enter 'E', 'C', or 'M'.");
                return;
            }
        } else if (input.equals("P")) {
            if (commodity == 'E') {
                commissionRate = 0.063;
            } else if (commodity == 'C') {
                commissionRate = 0.043;
            } else if (commodity == 'M') {
                commissionRate = 0.057;
            } else {
                System.out.println("Invalid commodity exchange. Please enter 'E', 'C', or 'M'.");
                return;
            }
        }

        double commission = inputAmount * commissionRate;
        double totalAmount = inputAmount + commission;

        String formattedCommission = String.format("%,.2f", commission);
        String formattedTotalAmount = String.format("%,.2f", totalAmount);
        String formattedInputAmount = String.format("%,.2f", inputAmount);

        System.out.println("Amount is: " + formattedInputAmount);
        System.out.println("Commission is: " + formattedCommission);
        System.out.println("Total amount is: " + formattedTotalAmount);
    }
}
