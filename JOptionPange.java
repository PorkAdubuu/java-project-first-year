import javax.swing.JOptionPane;

public class JOptionPange { 
      public static void main (String[] args) { 
      
      double result;
      char operator;
      
    String numb1 = JOptionPane.showInputDialog(null,"Enter Num1"); 
          double num1 = Double.parseDouble(numb1);
          
    String operation = JOptionPane.showInputDialog(null,"Choose operation + - * /"); 
       
          
    String numb2 = JOptionPane.showInputDialog(null,"Enter Num2"); 
          double num2 = Double.parseDouble(numb2); 
          
          
          switch (operation) { 
              
              case "+": 
              result = num1 + num2; 
              JOptionPane.showMessageDialog(null,result);
              break;
              
             }
          
                         
   
   }
 }
 