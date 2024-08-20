import java.util.Scanner; 
public class Loop_exercise { 
   
   public static void main(String[] args) { 
       
       Scanner loopwet = new Scanner(System.in); 
       
       
       
       //enter a number 
       System.out.println("Please enter a text"); 
         String text = loopwet.nextLine();
         
         int looping;
       
             do { 
                System.out.println("How many loop u want?");
                looping = loopwet.nextInt();
                } while (looping <=0);
            
            System.out.println("start at: ");
            int start = loopwet.nextInt();
         int actualloop = (start); 
             
             do { 
                System.out.println(actualloop + text);
                actualloop++;
                } while (actualloop <= looping);
       
       
       
    }
 }
        
       