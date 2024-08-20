import java.util.Scanner;

public class Wqwqw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNum = scanner.nextInt(); 
        System.out.println("Enter the second number:");
        int secondNum = scanner.nextInt();
        
        int result = calculate(firstNum, secondNum); 

        System.out.println("Result: " + result); 
    }

    
    public static int calculate(int num1, int num2) {
        if (num1 >= 10 && num1 < 20 && num2 >= 10 && num2 < 20) {
            return num1 + num2; 
        }
        else { 
        return 0; 
        }
       
    
    }
    
}
