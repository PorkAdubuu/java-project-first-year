public class Calculate {
    public static void main(String[] args) {
        int intValue1 = 5;
        int intValue2 = 10;
        double doubleValue1 = 3.5;
        double doubleValue2 = 2.5;

        // Pass two integers
       
        toCalculate(intValue1, intValue2);

        // Pass two doubles
       
        toCalculate(doubleValue1, doubleValue2);

        // Pass an integer followed by a double
        
        toCalculate(intValue1, doubleValue1);

        // Pass a double followed by an integer
        
        toCalculate(doubleValue2, intValue2);
    }

    // Method to add two integers
    public static void toCalculate(int num1, int num2) {
        System.out.println("Data 1: " + num1);
        System.out.println("Data 2: " + num2);
        System.out.println("Sum is: " + (num1 + num2));
        System.out.println();
    }

    // Method to multiply two doubles
    public static void toCalculate(double num1, double num2) {
        System.out.println("Data 1: " + num1);
        System.out.println("Data 2: " + num2);
        System.out.println("Multiplication result is: " + (num1 * num2));
        System.out.println();
    }

    // Method to display "Gryffindor!" for integer followed by double
    public static void toCalculate(int num1, double num2) {
        System.out.println("Data 1: " + num1);
        System.out.println("Data 2: " + num2);
        System.out.println("Gryffindor!");
        System.out.println();
    }

    // Method to display "Slytherin" for double followed by integer
    public static void toCalculate(double num1, int num2) {
        System.out.println("Data 1: " + num1);
        System.out.println("Data 2: " + num2);
        System.out.println("Slytherin");
        System.out.println();
    }
}