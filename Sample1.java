import java.util.Scanner; 

class Scanner_Sample1 { 
public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter name, age and salary:"); 
    
    //string input 
    String name = myObj.nextLine(); 
    
    //numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();
    
    //output input by user 
    
   System.out.println("Name: " + name);
   System.out.println("age: " + age); 
   System.out.printf("Salary: " + salary);
   
   }
   }