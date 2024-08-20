import java.io.*;
public class Ketchup {
  
  public static void main(String[] args) throws IOException { 
  
     BufferedReader boofer = new BufferedReader(new InputStreamReader(System.in));
     
     //hit enter 
     System.out.println("HIT ENTER TO START");
     String enter = boofer.readLine();
     //enter number
     System.out.print("ENTER THE NUMBER OF EGGS");
     String eggs = boofer.readLine();
     int NumEggs = Integer.parseInt(eggs);
     
     
   }
}