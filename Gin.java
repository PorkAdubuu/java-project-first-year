import java.io.*;
public class Gin { 
  
  public static void main(String[] args) throws IOException { 
  
      BufferedReader ginbulag = new BufferedReader(new InputStreamReader(System.in));
  
       //hit enter
       System.out.println("HIT ENTER TO START");
       String enter = ginbulag.readLine();
       //enter number 
       System.out.print("ENTER THE NUMBER OF EGGS");
       String egg = ginbulag.readLine();
       int NumEggs = Integer.parseInt(egg); 
  
  
  }
}