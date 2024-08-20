import javax.swing.JOptionPane;
import java.util.Scanner;

public class Mekusmekus {

     public static void main(String[] args) {
        
             Scanner scanner = new Scanner(System.in);
             
             System.out.println("PLEASE INPUT A NUMBER HERE");
             int num = scanner.nextInt();
             
             JOptionPane.showMessageDialog(null,num);
             
             String dialoginput = JOptionPane.showInputDialog(null,"please input a number with decimal");
             double numd = Double.parseDouble(dialoginput);
             
             System.out.println(numd);
             
      }
}
