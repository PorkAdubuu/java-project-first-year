import java.io.*;
public class Blat { 
  
  public static void main (String[] args) throws IOException {
  
     BufferedReader borat = new BufferedReader(new InputStreamReader(System.in));
     
     //HIT ENTER 
     System.out.println("HIT ENTER TO START");
     String name = borat.readLine();
     //INPUT NUMBER 
     System.out.println("Enter the number of eggs"); 
     String input = borat.readLine();
     int NumOfEggs = Integer.parseInt(input);
     
     }
 }
  
  