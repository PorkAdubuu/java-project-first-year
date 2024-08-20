import java.io.*; 
public class Mmdabuffered { 

   public static void main(String[]args)throws IOException { 
   
   BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
   
      int fine;
      int exceeding;
      int exceedingfine;
      int total;
   
      System.out.println("Enter vehicle speed");
      String sp = reader.readLine();
      int speed = Integer.parseInt(sp);
      
      if (speed <= 70 && speed >= 55) { 
         fine = 2000;
         exceeding = speed - 55;
         exceedingfine = exceeding * 150; 
         total = exceedingfine + fine; 
         
         System.out.println(total);
         }
         else {
         fine = 5000;
         exceeding = speed - 70;
         exceedingfine = exceeding * 200; 
         total = exceedingfine + fine; 
         
         System.out.println(total);
         }
  }
}