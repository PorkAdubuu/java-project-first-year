import java.io.*;
public class Loopings { 
 
 public static void main(String[] args) throws IOException { 
    
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
      
      int number = 1;
      
      
      while (number <= 5) 
      { 
      System.out.println("Hello");
      number++;
      }
      
      int x; 
      for (x=1; x<=5; x++) { 
      System.out.println(x);
      }
      
      int count = 0;
      while (count < 5) {
      ++count;
      System.out.print("sda\n" + count);
      }
      System.out.println(count);
   
   }
 }
       