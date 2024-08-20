import java.io.*;
public class ExerciseArray { 
   
   public static void main(String[]args) throws IOException { 
   
   BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
   
   //variable fix number ng student which is 5
   int numStudents = 5;
   //array for the student name dito mag e store ang inputs 
   String[] studentNames = new String[numStudents];
   //array for student grades dito naman mag e store yung grade input
   int[] studentGrades = new int[numStudents];
   
   //for loop for 5 iteration 
   for (int a=0; a < numStudents; a++) {
      System.out.print("Enter student name " + (a + 1) + ": ");
      studentNames[a] = br.readLine();
      System.out.print("Student Grade: ");
      studentGrades[a] = Integer.parseInt(br.readLine());
      }
      System.out.println("Array Elements: ");
       
       for (int b = 0; b < numStudents; b++) {
          System.out.println(studentNames[b] + " " + studentGrades[b]);
       }
       
       double average = (double)(studentGrades[0] + studentGrades[1] + studentGrades[2] + studentGrades[3] + studentGrades[4]) / numStudents; 
       System.out.printf("Average is: %.1f\n", average);
      

      
  }
}
