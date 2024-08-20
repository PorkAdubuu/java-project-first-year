import java.util.Scanner;
public class Mmda {

   public static void main(String[]args) { 
      Scanner scanner = new Scanner (System.in); 
      
      int fine;
      int exceeding;
      int exceedingfine;
      int total;
      System.out.println("Enter the vehicle speed"); 
      int speed = scanner.nextInt();
      
      if (speed <= 70 && speed >= 55) { 
         fine = 2000; 
            exceeding = speed - 55;
             exceedingfine = exceeding * 150;
         
            total = fine + exceedingfine; 
         
         System.out.println(total);
         }
         else if (speed >= 70) {
            fine = 5000;
            exceeding = speed - 70;
            exceedingfine = exceeding * 200;
            
            total = fine + exceedingfine;
            
            System.out.println(total);
            }
     
  }
}