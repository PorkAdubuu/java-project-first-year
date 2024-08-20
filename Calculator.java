import java.util.Scanner; 

public class Calculator
{ 
   public static void main(String[] args)
     {
     
     //variable declaration
       char operator; 
       double num1, num2, result;
       
       Scanner input = new Scanner(System.in);
       
       //operation to be used
       
       System.out.println("select operation");
       operator = input.next().charAt(0); 
       
       //first number 
       
       System.out.println("enter your first number"); 
       num1 = input.nextDouble(); 
       
       //second number 
       
       System.out.println("enter your second number");
       num2 = input.nextDouble(); 
       
       switch (operator) { 
       
       case 'A' :
       result = num1 + num2; 
       System.out.println(num1 + "+" + num2 + "=" + result);
       break;
       
       case 'B' :
       result = num1 - num2;
       System.out.println(num1 + "-" + num2 + "=" + result);
       break; 
       
       case 'C' :
       result = num1 * num2;
       System.out.println(num1 + "*" + num2 + "=" + result);
       break; 
       
       default: 
       System.out.println("invalid choice");
       break; 
       
       }
       
       }
   }
      