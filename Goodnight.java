import java.util.Scanner; 
public class Goodnight { 
   
   public static void main(String[] args) { 
     
     Scanner input = new Scanner(System.in); 
       
       double result; 
       
         
       
       System.out.println("num1"); 
       double num1 = input.nextDouble(); 
       
       System.out.println("num2"); 
       double num2 = input.nextDouble(); 
       
       System.out.println("select an operation");
      String operator = input.nextLine();
       
       
       
       
       switch(operator) { 
           case "a":
           result = num1 + num2; 
           System.out.println(result);
           }
           
         
      }
  }