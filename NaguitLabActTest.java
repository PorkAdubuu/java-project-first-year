import javax.swing.JOptionPane;

public class NaguitLabActTest {
    public static void main(String[] args) {
        String customer_name, pizza_type, pizza_size, senior_citizen;
        int type = 0;

        customer_name = JOptionPane.showInputDialog(null, "+++++++++++++++\nPIZZA COMPANY\n+++++++++++++++\nInput your name");

        pizza_type = JOptionPane.showInputDialog(null, "+++++++++++++++\nPIZZA COMPANY\n+++++++++++++++\nA. Pizza Deluxe - P300\nB. Meatlovers Pizza - P250\nC. Garden Fresh Pizza - P175\nInput your pizza type: ");

        if (pizza_type.equalsIgnoreCase("A")) {
            type = 300;
        } else if (pizza_type.equalsIgnoreCase("B")) {
            type = 250;
        } else if (pizza_type.equalsIgnoreCase("C")) {
            type = 175;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid pizza type: " + pizza_type);
            return;
        }

        pizza_size = JOptionPane.showInputDialog(null, "+++++++++++++++\nPIZZA COMPANY\n+++++++++++++++\n1. Personal - P50\n2. Double - P175\n3. Family Size - P250\nInput your pizza size: ");

        // pizza size and total bill 
        double sizeCost = 0;

        switch (pizza_size) {
            case "1":
                sizeCost = 50.00;
                break;
            case "2":
                sizeCost = 175.00;
                break;
            case "3":
                sizeCost = 250.00;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid pizza size: " + pizza_size);
                return;
        }

        double totalBill = type + sizeCost;
        senior_citizen = JOptionPane.showInputDialog(null, "Senior Citizen <Y/N: >");
        String Ttotalbill = String.format("%,.2f", totalBill);  // Moved declaration outside the if-else block
        if (senior_citizen.equalsIgnoreCase("Y")) {
            double discount = 0.20 * totalBill;
            totalBill -= discount;
            Ttotalbill = String.format("%,.2f", totalBill);
            JOptionPane.showMessageDialog(null, "Total bill is: " + Ttotalbill);
        } else {
            JOptionPane.showMessageDialog(null, "Total bill is: " + Ttotalbill);
        }
    }
}
