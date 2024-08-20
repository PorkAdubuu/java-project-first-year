import javax.swing.JOptionPane; 
public class Questions { 
    
    public static void main(String[] args) {
    
       int score = 0;
       String key = "";
       String key2 = "";
       
       JOptionPane.showMessageDialog(null,"Please write you answer in a CAPITAL letter only!");
    
       //question number 1 
       String one = JOptionPane.showInputDialog(null,"This is the heart of a computer" + "\nA. RAM\nB. CPU\nC. MOBO");
         switch (one) { 
              case "B": 
              score += 1; 
              key = "Correct";
              break;
              
              default: 
              score += 0;
              key = "Incorrect";
              break;
              }
              
        String two = JOptionPane.showInputDialog(null,"Serve as temporary data storage" + "\nA. RAM\nB. CPU\nC. MOBO");
         switch (two) { 
              case "A": 
              score += 1; 
              key2 = "Correct";
              break;
              
              default: 
              score += 0;
              key2 = "Incorrect";
              break;
              }

         //score
        JOptionPane.showMessageDialog(null,"Your score is: " + score);
        //keys
        JOptionPane.showMessageDialog(null,"1. " + key + "\n2. " + key2);
              
       
       
    }
}