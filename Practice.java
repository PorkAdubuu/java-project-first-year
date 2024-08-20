import java.util.Scanner; 
public class Practice { 
    
    public static void main(String[] args) { 
    
    Scanner scanner = new Scanner(System.in); 
    
    double num1, num2, result;
     
     System.out.println("enter a number"); 
     num1 = scanner.nextDouble(); 
     
     System.out.println("select an operator");
     String operator = scanner.nextLine();
     
     switch (operator) { 
            
            case "+" :
               result = num1 + num2; 
               System.out.println(num1 + "+" + num2 + "=" + result);
               break;
     }
     
     
     System.out.println("enter a number"); 
     num2 = scanner.nextDouble();
     
     
     
  }
}
    