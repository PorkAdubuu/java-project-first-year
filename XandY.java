import java.util.Scanner;
public class XandY { 

    public static void main(String[] args) { 
       
       Scanner scanner = new Scanner(System.in); 
         
         
         System.out.println("enter your grade");
          int score = scanner.nextInt();
          
          if (score < 60)
            
            System.out.println("Your grade is: fail");
          
          else { 
            
            System.out.println("Your grade is: Pass"); 
            }
            
            
            
            
    }
 }