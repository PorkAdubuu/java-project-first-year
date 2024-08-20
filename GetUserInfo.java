import java.util.Scanner; 
public class GetUserInfo
{ 
   public static void main(String[] args) 
      {
         String name; 
         int age; 
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("please enter your name >> "); 
         name = inputDevice.nextLine();
         System.out.print("please enter your age >> ");
         age = inputDevice.nextInt();
         System.out.print("Your name is " + name + " and you are " + age + "years old.");
         
         
       }
       }