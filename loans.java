import java.util.Scanner;
public class loans {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
         System.out.println("Enter the annual income of the applicant ");
          double Annualincome = scan.nextDouble();
          
         System.out.println("Enter the amount of Loan: ");
          double Loanamount = scan.nextDouble();
          
         System.out.println("Enter the number of years of Loan");
            int Years = scan.nextInt();
         
         System.out.println("Your annual income is: $" + Annualincome + "\nYour request loan is: $" + Loanamount + "\nYears of loan: " + Years);
         System.out.println("===================================");
            if (Loanamount <= 5000.00 && Annualincome >= 30000.00) {
               System.out.println("The Loan is approved");
            }
            else if (Loanamount >= 5000.00 && Loanamount <= 20000.00 && Annualincome >= 75000.00) { 
               System.out.println("The Loan is approved");
            }
            else { 
               System.out.println("The Loan is NOT approved");
            }
            
   }
}