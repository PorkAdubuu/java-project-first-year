import java.io.*;
public class QandA { 
    
    public static void main(String[] args)throws IOException {
       
       int score = 0;
       String key = ""; 
       String key2 = "";
       
       BufferedReader test = new BufferedReader(new InputStreamReader(System.in)); 
       
       //instruction
       System.out.println("Write your answer in a CAPITAL letter only");
       System.out.println("==========================================");
       
       //question without choices
       System.out.println("1. Give the meaning of HTML");
       String answer1 = test.readLine();
       //answer key by switch case 
       switch (answer1) { 
            case "HYPER TEXT MARKUP LANGUAGE": 
            score += 1;
            key = "correct";
            break;
            
            default: 
            key = "incorrect";
            break; 
            } 
        System.out.println("==========================================");
        
       //question with choices 
       System.out.println("All are programming language except. \nA. HTML\nB. JAVA\nC. English");
       String answer2 = test.readLine();
       //answer key 
       switch (answer2) { 
             case "C":
             score += 1;
             key2 = "correct";
             break;
             
             default: 
             key2 = "incorrect";
             break;
             }
       String sumsco =
       "==========================================\n" +
       "            Summary of quiz\n" +
       "1. " + key + "\n2. " + key2 +
       "\nYour score is: " + score + "/2\n" +
       "==========================================";
       
       System.out.print(sumsco);
            
   }
}