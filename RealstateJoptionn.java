import javax.swing.JOptionPane; 
public class RealstateJoptionn {

   public static void main(String[]args) {
   
   String pr = JOptionPane.showInputDialog(null,"Enter the price of the property");
      double price = Double.parseDouble(pr);
      
   String cl = JOptionPane.showInputDialog(null,"Enter the class of the propety");
      int clas = Integer.parseInt(cl);
      
      
      switch (clas) { 
         case 1:
            double rate = 0.045;
            double commision = rate * price;
           
            JOptionPane.showMessageDialog(null,"Selling Price: " + price + "\nProperty Class: " + clas + 
            "\nCommision Rate: 4.5%" + "\nCommision: " + commision);
         break;
         
         default:
            JOptionPane.showMessageDialog(null,"Error wrong class");
         break;
      }
   
   
   }
}