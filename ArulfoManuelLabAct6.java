import javax.swing.JOptionPane;

public class ArulfoManuelLabAct6 {
    public static void main(String[] args) {

        String result;
        result = JOptionPane.showInputDialog(null, "Customer's Name");
        JOptionPane.showMessageDialog(null, "Welcome!");

        String type = JOptionPane.showInputDialog(null,
                "+++++++++++++++\n" + "PIZZA COMPANY\n" + "+++++++++++++++\n" + "A. Pizza Deluxe- P300\n"
                        + "B. Meatlovers Pizza- P250\n" + "C. Garden Fresh Pizza- P175\n" + "Input your type:",
                "MESSAGE", JOptionPane.QUESTION_MESSAGE);

        String size = JOptionPane.showInputDialog(null,
                "+++++++++++++++\n" + "SELECT PIZZA SIZE\n" + "+++++++++++++++\n" + "1. Personal- P50\n"
                        + "2. Double- P175\n" + "3. Family Size- P250\n" + "Input your pizza size: ", "MESSAGE",
                JOptionPane.QUESTION_MESSAGE);

        String senior = JOptionPane.showInputDialog(null, "Senior Citizen <Y/N:>", "MESSAGE",
                JOptionPane.QUESTION_MESSAGE);

        char pizzaType = type.toUpperCase().charAt(0);
        char pizzaSize = size.charAt(0);
        char discount = senior.toUpperCase().charAt(0);

        double amount = 0;
        double totalBill;

        switch (pizzaType) {
            case 'A':
                switch (pizzaSize) {
                    case '1':
                        amount = 350;
                        break;
                    case '2':
                        amount = 475;
                        break;
                    case '3':
                        amount = 550;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Pizza Size!");
                        return;
                }
                break;
            case 'B':
                switch (pizzaSize) {
                    case '1':
                        amount = 300;
                        break;
                    case '2':
                        amount = 425;
                        break;
                    case '3':
                        amount = 500;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Pizza Size!");
                        return;
                }
                break;
            case 'C':
                switch (pizzaSize) {
                    case '1':
                        amount = 225;
                        break;
                    case '2':
                        amount = 350;
                        break;
                    case '3':
                        amount = 425;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Pizza Size!");
                        return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Pizza Type!");
                return;
        }

        if (discount == 'Y') {
            totalBill = amount - (amount * 0.2);
            String bill = String.format(" Total bill is: %,.2f", totalBill);
            JOptionPane.showMessageDialog(null, "" + bill);
        } else if (discount == 'N') {
            totalBill = amount;
            String bill = String.format(" Total bill is: %,.2f", totalBill);
            JOptionPane.showMessageDialog(null, "" + bill);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid");
        }
    }
}
