import javax.swing.JOptionPane; 

public class Jopsion { 
  
  public static void main(String[] args) {
  
       //Hit enter to start 
       JOptionPane.showMessageDialog(null,"Hit enter to start");
       
       //Enter number of eggs
       String input = JOptionPane.showInputDialog(null,"enter the number of eggs:");
       int NumberOfEggs = Integer.parseInt(input);
       
       //receipt
       //dozen and loose computation
       int dozen = NumberOfEggs / 12;
       int loose = NumberOfEggs % 12;
       //total computtaion
       double total = dozen * 36 + loose * 4.75;
       //format 
       String formatTotal = String.format("%,.2f", total);
       //total egg input,dozen
       JOptionPane.showMessageDialog(null,"You ordered: " + NumberOfEggs + "\nNo of dozen: " + dozen + "\nNo. of loose: " + loose + "\nYour total due amount is: " + formatTotal);
  
  }
}