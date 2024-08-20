import javax.swing.JOptionPane;
public class Nigga { 
 
  public static void main(String[] args) { 
      
        String input = JOptionPane.showInputDialog(null,"Enter a text");
        
        int numloop; 
        do { 
            String looping = JOptionPane.showInputDialog(null,"Number of loop you want"); 
            numloop = Integer.parseInt(looping);
           } while (numloop <= 0); 
           
        int looping = 1;
        do { 
            JOptionPane.showMessageDialog(null,looping + input);
            looping++;
           } while (looping <= numloop);
           
           
   }
}