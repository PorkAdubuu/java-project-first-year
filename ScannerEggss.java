import java.util.Scanner;
public class ScannerEggss {

     public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in); 
     
     System.out.println("HIT ENTER TO START"); 
     String name = scanner.nextLine();
     
     System.out.println("WELCOME TO FARM");
     
     //INPUT
     System.out.print("enter the number of eggs: "); 
     int NumberOfEggs = scanner.nextInt(); 
     //receipt 
     //total number of eggs output 
     System.out.println("You ordered: " + NumberOfEggs); 
     //dozen computation 
     int dozen = NumberOfEggs / 12; 
     //dozen output
     System.out.println("No. of Dozen: " + dozen); 
     //loose computation 
     int loose = NumberOfEggs % 12; 
     //loose output 
     System.out.println("No. of loose: " + loose);
     //total computation
     double total = dozen * 36.00 + loose * 4.75;
     //total amount computation
     System.out.println("==============================");
     //format 
     String formatTotal = String.format("%,.2f", total);
     System.out.println("Your total amount due: " + formatTotal);
     
     
     }
     
}