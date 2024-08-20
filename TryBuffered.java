import java.io.*;
public class TryBuffered { 
  
  public static void main(String[] args) throws IOException { 
  
    BufferedReader sheesh = new BufferedReader(new InputStreamReader(System.in));
  
    //HIT ENTER TO START 
    System.out.println("HIT ENTER TO START");
    sheesh.readLine();
    //INPUT NUMBER OF EGGS AND VARIABLE NUMBER OF EGGS
    System.out.print("ENTER THE NUMBER OF EGGS: ");
    String input = sheesh.readLine(); 
    int NumOfEggs = Integer.parseInt(input);
    //receipt
    //display number of eggs
    System.out.println("You ordered: " + NumOfEggs);
  }
}
  
  