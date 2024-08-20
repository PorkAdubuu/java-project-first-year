import javax.swing.JOptionPane; 
public class LastJoption { 
   
   public static void main(String[] args) {
   
      //hit enter 
      JOptionPane.showMessageDialog(null,"HIT ENTER TO START"); 
      //INPUT NUMBER OF EGGS
      String input = JOptionPane.showInputDialog(null,"ENTER THE NUMEBR OF EGGS:");
      int NumEggs = Integer.parseInt(input);
      //receipt 
      //dozen and loose variable
      int dozen = NumEggs / 12;
      int loose = NumEggs % 12; 
      //total computation
      double total = dozen * 36 + loose * 4.75;
      //format 
      String formatTotal = String.format("%,.2f", total);
      //number of eggs, dozen. lose and total
      JOptionPane.showMessageDialog(null,"You ordered: " + NumEggs + " eggs" + "\nNo. of dozen: " + dozen + "\nNo of loose: " + loose + "\nYour total amount due is: " + formatTotal);
      
   }
}