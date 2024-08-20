import javax.swing.JOptionPane;
public class Calcutry { 
   
   public static void main(String[] args) {
   
   double num1, num2, result; 
   
   String numb1 = JOptionPane.showInputDialog(null,"Enter first number");
   num1 = Double.parseDouble(numb1);
   
   String operator = JOptionPane.showInputDialog(null,"Please select an operation" + "\n( + - / *)");
   
   String numb2 = JOptionPane.showInputDialog(null,"Enter second number");
   num2 = Double.parseDouble(numb2);
   
            switch (operator) { 
            
            case "+" :
            result = num1 + num2;
            JOptionPane.showMessageDialog(null, num1 + "+" + num2 + "=" + result);
            break;
            
            default: 
            JOptionPane.showMessageDialog(null,"INVALID OPERATION");
            break;
   
   
   
   
     }
     
     
     JOptionPane.showMessageDialog(null,"THANKYOU FOR USING CALCULATOR");
   }
}