import javax.swing.JOptionPane;
public class jabol { 
  
  public static void main(String[] args) { 
  
    //hit enter 
    JOptionPane.showMessageDialog(null,"HIT ENTER TO START");
    //ENTER NUMBER 
    String input = JOptionPane.showInputDialog(null,"Enter the number of eggs");
    int NumberOfEggs = Integer.parseInt(input);
  
  
  }
}