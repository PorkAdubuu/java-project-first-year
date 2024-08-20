/*create a java program that will pass two data in method named toCalculate. If the main method passes both integer data type,
add the two numbers; if double data type, multiply the two numbers; if the data pass is integer data type followed by double data type,
display "Gryffindor!". If the main method passes a double data type followed by an integer data type, display "Slytherin!"
Apply method overloading.
*/ 

import java.util.Scanner;
 public class LabExam { 
 
   public static void toCalculate(int data1, int data2) {
        int sum = data1 + data2;
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Sum is: " + sum);
    }

   
    public static void toCalculate(double data1, double data2) {
        double product = data1 * data2;
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Product is: " + product);
    }

   
    public static void toCalculate(int data1, double data2) {
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Gryffindor!");
    }

    
    public static void toCalculate(double data1, int data2) {
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Slytherin!");
    }

 
 
      public static void main(String[]args) { 
      
        toCalculate(10, 20);          
        System.out.println();

        toCalculate(32.5, 27.5);        
        System.out.println();

        toCalculate(27, 32.75);          
        System.out.println();

        toCalculate(27.25, 10);
      
      
      
      
      
      }
      
      

}