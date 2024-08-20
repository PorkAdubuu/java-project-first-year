import java.util.Scanner; 
public class Baggagescanner { 

   public static void main(String[]args) { 
   
      Scanner scanner = new Scanner(System.in);
   
         System.out.println("Enter the baggage in wieght"); 
         double baggage = scanner.nextDouble();
         
         if (baggage <= 50) { 
            System.out.println("No charge");
            }
            else { 
            double fee = 350;
            double exceeding = baggage - 50;
            double exceedingfee = exceeding * 35;
            double total = exceedingfee + fee; 
            
            System.out.println(total);
            }
   
   }
}