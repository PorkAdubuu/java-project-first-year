import java.io.*;
public class Baggagebuffered {

   public static void main(String[]args) throws IOException { 
   
      BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
   
         System.out.println("Enter weight");
         String bg = reader.readLine();
         int baggage = Integer.parseInt(bg);
         
         if (baggage <= 50 ) {
            System.out.println("No charges");
            }
            else {
               
               int exceeding = baggage - 50;
               int exceedingfee = exceeding * 35;
               int total = exceedingfee + 350;
               
               System.out.println(total);
               }
               
   
   
   
   }
}