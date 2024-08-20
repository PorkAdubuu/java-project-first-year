import java.io.*;
public class Tiktok { 
   
   public static void main(String[] args) throws IOException {
   
      BufferedReader ratbu = new BufferedReader(new InputStreamReader(System.in));
   
   
            //hit enter 
            System.out.println("HIT ENTER TO START");
            String enter = ratbu.readLine(); 
            //enter number 
            System.out.println("ENTER THE NUMBER OF EGGS");
            String eggs = ratbu.readLine(); 
            int NumEggs = Integer.parseInt(eggs);
            //receipt 
            System.out.println("YOUR ORDERED: " + NumEggs);
   }
}
