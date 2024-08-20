import java.io.*;

public class Part2complete {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input number of students
        System.out.print("Number of Students: ");
        String NS = br.readLine();
        int Num_of_Stud = Integer.parseInt(NS);

        // Arrays to store student details
        int[] studentNumbers = new int[Num_of_Stud];
        String[] studentNames = new String[Num_of_Stud];
        int[] studentGrades = new int[Num_of_Stud];

        // Input student details
        for (int i = 0; i < Num_of_Stud; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Student Number: ");
            studentNumbers[i] = Integer.parseInt(br.readLine());
            System.out.print("Student Name: ");
            studentNames[i] = br.readLine();
            System.out.print("Student Grade: ");
            studentGrades[i] = Integer.parseInt(br.readLine());
        }

        char choice;
        do {
            // Menu
            System.out.println("\nSort By [S] Student Number [G] Grade [V] View [E] Exit: ");
            choice = br.readLine().charAt(0);
            switch (Character.toUpperCase(choice)) {
                case 'S':
                    // Sorting by student number
                    for (int i = 0; i < Num_of_Stud - 1; i++) {
                        for (int j = 0; j < Num_of_Stud - i - 1; j++) {
                            if (studentNumbers[j] > studentNumbers[j + 1]) {
                                // Swap student details
                                int tempNumber = studentNumbers[j];
                                studentNumbers[j] = studentNumbers[j + 1];
                                studentNumbers[j + 1] = tempNumber;

                                String tempName = studentNames[j];
                                studentNames[j] = studentNames[j + 1];
                                studentNames[j + 1] = tempName;

                                int tempGrade = studentGrades[j];
                                studentGrades[j] = studentGrades[j + 1];
                                studentGrades[j + 1] = tempGrade;
                            }
                        }
                    }
                    // Display sorted records
                    viewRecords(studentNumbers, studentNames, studentGrades);
                    break;
                case 'G':
                    // Sorting by grade
                    for (int i = 0; i < Num_of_Stud - 1; i++) {
                        for (int j = 0; j < Num_of_Stud - i - 1; j++) {
                            if (studentGrades[j] < studentGrades[j + 1]) {
                                // Swap student details
                                int tempNumber = studentNumbers[j];
                                studentNumbers[j] = studentNumbers[j + 1];
                                studentNumbers[j + 1] = tempNumber;

                                String tempName = studentNames[j];
                                studentNames[j] = studentNames[j + 1];
                                studentNames[j + 1] = tempName;

                                int tempGrade = studentGrades[j];
                                studentGrades[j] = studentGrades[j + 1];
                                studentGrades[j + 1] = tempGrade;
                            }
                        }
                    }
                    // Display sorted records
                    viewRecords(studentNumbers, studentNames, studentGrades);
                    break;
                case 'V':
                    // View records
                    viewRecords(studentNumbers, studentNames, studentGrades);
                    break;
                case 'E':
                    System.out.println("Process Completed.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (Character.toUpperCase(choice) != 'E');

        // Close BufferedReader
        br.close();
    }

    // Method to view student records
    private static void viewRecords(int[] studentNumbers, String[] studentNames, int[] studentGrades) {
        for (int i = 0; i < studentNumbers.length; i++) {
            System.out.println(studentNumbers[i] + " " + studentNames[i] + " " + studentGrades[i]);
        }
    }
}
