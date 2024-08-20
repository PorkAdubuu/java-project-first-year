import javax.swing.JOptionPane; 
public class Mouse { 
   
   public static void main(String[] args) { 
   
   double dozenPrice = 36;
   double loosePrice = 4.75;
       //Joption 
       JOptionPane.showMessageDialog(null, "Hit enter to start");
       
       //enter number 
       String enter = JOptionPane.showInputDialog(null,"ENTER THE NUMBER OF EGGS");
       int NumEggs = Integer.parseInt(enter);
       
       //receipt 
       int dozen = NumEggs / 12;
       int loose = NumEggs % 12; 
       double total = dozen * dozenPrice + loose * loosePrice;
       String formatTotal = String.format("%,.2f", total);
       
       JOptionPane.showMessageDialog(null,"You ordered: " + NumEggs + "\nNo. of Dozens: " + dozen + "\nNo. of loose: " + loose + "\nTotal due amount: " + formatTotal);
       
       String trymessage = String.format("hello madapka");
       
   }
}