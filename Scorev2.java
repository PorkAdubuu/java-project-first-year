import java.util.Scanner; 
public class Scorev2 { 
    
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
     System.out.println("Type the score");
     int score = scanner.nextInt(); 
     
     if (score >= 1 && score <= 59) {    
         System.out.println("Your grade is F "); 
         
      } 
      
    else if (score >= 60 && score <= 69 ) { 
          System.out.println(" your grade is D"); 
          
        }
    else if (score >= 70 && score <= 79 ) { 
          System.out.println(" your grade is C");
          
        }
        
    else if (score >= 80 && score <= 89 ) { 
          System.out.println(" your grade is B"); 
          
        }
    else  if(score >= 90 && score <= 99 ) { 
        System.out.println("your grade is A");
        
        }      
     else {
       System.out.println("invalid");
       
       }
      }
   }