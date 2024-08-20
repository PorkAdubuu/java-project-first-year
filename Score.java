import java.util.Scanner; 
public class Score { 
    
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
     System.out.println("Type the score");
     int score = scanner.nextInt(); 
     
     if (score < 60) { 
         
         System.out.println("Your grade is F"); 
      } 
      
     else if (score < 70 ) { 
          System.out.println(" your grade is D"); 
        }
     else if (score < 80 ) { 
          System.out.println(" your grade is C"); 
        }
        
     else if (score < 90 ) { 
          System.out.println(" your grade is B"); 
        }
      else if (score < 100 ) { 
          System.out.println(" your grade is A"); 
        }
     
      else {
       System.out.println("invalid");
       }
      }
   }