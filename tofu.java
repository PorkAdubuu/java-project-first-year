import java.util.Scanner;

public class tofu { 
     public static void main(String[] args) { 
     
     Scanner sheesh = new Scanner(System.in);
     
     
     
     System.out.println("PLEASE HIT ENTER TO START" + "\n===============================");
     String name = sheesh.nextLine();
     System.out.print("WELCOME TO DIZON FARM!" + "\n===============================\n");
     
     //INPUT BY USER 
     System.out.print("enter eggs: ");
     int numeggs = sheesh.nextInt();
     
     //receipt 
     System.out.println("==========================");
     System.out.println("you ordered: " + numeggs);
     
     //computation 
     int dozen = numeggs / 12;
     int loose = numeggs % 12;
     double dueamount = dozen * 36.00 + loose * 4.75;
     
      
     
     
     
     
     //dozen output
     System.out.println("no of dozen: " + dozen + " it cost 36 per dozen");
     //loose output 
     System.out.println("no of loose: " + loose + " it cost 4.75 per loose eggs" + "\n==========================");
     //format
     String formattedDueamount = String.format("%,.2f", dueamount);
     //total amount due 
     System.out.println("your total due amount is: " + formattedDueamount);
     
     
     
     
     
     
     
     
     }
}