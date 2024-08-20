import java.util.Scanner; 
public class Bane_MIDEX_Scanner { 
   
   public static void main(String[] args) { 
   
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("PELASE ENTER SECONDS");
   int totalSeconds = scanner.nextInt();
     
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        
        System.out.println("Input seconds: " + totalSeconds);
        
        System.out.println(hours + ":" + minutes+ ":" + seconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: "+ seconds);
     
     
    
     
   
   }
}