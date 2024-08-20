import java.util.Scanner;
public class Poblem1 {
  
  public static void main(String[] args) { 
  
    Scanner scanner = new  Scanner(System.in);
    
    System.out.println("speed: "); 
    int speed = scanner.nextInt();
    
    int speedIllegal = 70; 
    int legalSpeed = 55;
    int Illegalspeedfine = 2000;
    int fineExceedingIllegalspeed = 150;
    int overseventyspeed = 5000; 
    int overexceeding = 200;
    
    
    if (speed >= 56 && speed <= 70) {   
       
       //computation ng fine kada lalagpas ng 55 ay + 150 
       //speed = input ng user minus legal speed na 55 so pag input ng user ay 56 
       //56-55 = 1 tapos ang sagot ay e ta time sa fineExceedingIllegalspeed na naka declare ang value na 150 
       //so bale 1 * 150 = 150 ito ngayon yung e aadd natin sa base fine na 2000 sa baba ang computation 
       int excessspeed = (speed - legalSpeed)*fineExceedingIllegalspeed; 
       
       //dito na yung total natin
       //Illegalspeedfine naka declare ang value niya sa taas ay 2000, ito yung basefine natin sa problem 1 na kapag 
       //nag exceed sa 55 speed and basta below 70miles per hour ito yung fine niya 
       //excessspeed which is yung variable na nilagyan natin ng formula sa taas na sa example ko may nakuha tayong answer na 1 
       //so dito 2000 + 150 = 2150 
       int total = Illegalspeedfine + excessspeed;
       System.out.println("your fine is: " + total);
       } 
       //else if kasi why not djk lang 
       //dito natin kukunin yung kapag sobra na sa 70 yung speed 
       //formula is parang yung nasa taas lang din sa if condtion 
       //else if speed which is yung input parin ng user is greaterthan or equal to speedIllegal na may value na 70
       else if (speed >= speedIllegal) { 
       
       //dito formula na ng 70 plus speed violation 
       // so speed minus speedIllegal ganito siya bale 
       //kunyare ang input natin ay 71, so 71-70 = 1
       //1 * overexceeding na may value na 200 ito yung fine sa over 70 speed violation
       // bale magiging 1 * 200 = 200 
         int seventyplus = (speed - speedIllegal)*overexceeding; 
       
       //ito na yung total formula 
       //overseventyspeed na may value na 5000 which is base fine natin kapag umabot o lumagpas ng 70 speed + seventyplus which is yung 
       //variable natin sa taas nito na may formula na rin
       // so bale totalv2 is = 5000 + 200 = 5200
       
         int totalv2 = overseventyspeed + seventyplus; 
         System.out.println("Your fine is: " + totalv2);
       } 
       
       //idk if need to nilagay ko lang incase, pag nag input si user ng 55 below edi walang violation
       //pwede tanggalin tong else gagana parin. 
       else { 
       
       System.out.println("You're good to go");
       
       }

   }
}