import java.util.Scanner;
public class EggExercise { 
      public static void main(String[] args) { 
      
      Scanner itlog = new Scanner(System.in);
      
      double DozensPrice = 36.00;
      double LoosePrice = 4.75;
      
      
      
      System.out.println("PRESS ENTER TO START"); 
      System.out.print("======================\n");
      String name = itlog.nextLine();
      System.out.println("WELCOEM TO DIZON FARM" + "\n======================");    
      // INPUT EGGS 
      System.out.print("PLEASE ENTER QUANTITY OF EGGS: ");
      int numeggs = itlog.nextInt();
      System.out.println("======================");
      
      //calculate the total amount 
      int dozens = numeggs / 12;
      int loose = numeggs % 12; 
      double dueamount; 
      
      dueamount = dozens * DozensPrice + loose * LoosePrice;
      
      System.out.println("You have ordered: " + numeggs + " eggs");
      System.out.println("No of dozen: " + dozens + " >priced for 36 per dozen"); 
      System.out.println("No of loose: " + loose + " >>priced for 4.75 per loose eggs" + "\n======================");
      System.out.println("YOUR TOTAL DUE AMOUNT IS: " + dueamount);
      
      
      
      
      
      
      
      
      
      }
}