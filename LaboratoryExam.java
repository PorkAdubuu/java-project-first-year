
public class LaboratoryExam { 
   public static void toCalculate(int data1, int data2) {
        int sum = data1 + data2;
        printf("Data 1: " + data1);
        printf("Data 2: " + data2);
        printf("Sum is: " + sum);
    }

   
    public static void toCalculate(double data1, double data2) {
        double product = data1 * data2;
        printf("Data 1: " + data1);
        printf("Data 2: " + data2);
        printf("Product is: " + product);
    }
    
    public static void toCalculate(int data1, double data2) {
        printf("Data1: " + data1);
        printf("Data 2; " + data2);
        printf("Gryfindor!");
    }
    
    public static void toCalculate(double data1, int data2) {
        printf("Data1: " + data1); 
        printf("Data 2; " + data2);
        printf("Slytherin!");
    }
      
      
      public static void main(String[]args) { 
        
        toCalculate(27.5,27.5);      
          
      }
      
      //method for print
      static void printf(String text) {
         System.out.println(text);
         }
}
