import javax.swing.JOptionPane;
public class MmdaJoption {

   public static void main(String[]args) { 
   
      int fine;
      int exceeding;
      int exceedingfine;
      int total;
   
      String sp = JOptionPane.showInputDialog(null,"Enter vehicle speed");
      int speed = Integer.parseInt(sp);
      
      if (speed <= 70 && speed >= 55) { 
         fine = 2000;
         exceeding = speed - 55;
         exceedingfine = exceeding * 150;
         total = fine + exceedingfine;
         
         JOptionPane.showMessageDialog(null,total);     
         }
         else {
         fine = 5000;
         exceeding = speed - 70;
         exceedingfine = exceeding * 200;
         total = fine + exceedingfine;
         
         JOptionPane.showMessageDialog(null,total);
         }
   
   }
}
   
   