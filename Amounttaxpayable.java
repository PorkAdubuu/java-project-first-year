import java.io.*;
public class Amounttaxpayable { 
    
    public static void main(String[]args) throws IOException { 
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    
            System.out.print("Type (A) if you are single and (B) if you are married: ");
             String ab = reader.readLine();
             
            System.out.print("Please input you wage: ");
            String wg = reader.readLine();
            double wage = Double.parseDouble(wg);
            
            double taxrate = 0;
            double withhold = 0;
            
            if (ab.equalsIgnoreCase("A")) {
               if (wage >= 0 && wage <= 6300) { 
               taxrate = 0; 
               withhold = 0;
               System.out.println("your're tax free");
               }
               else if (wage >= 6300 && wage <= 7300) { 
               taxrate= 0.005;
               withhold = 0;
               double excess = wage - 6300;
               double excesstax = (wage - 6300) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 7300 && wage <= 8800) { 
               taxrate= 0.01;
               withhold = 5;
               double excess = wage - 7300;
               double excesstax = (wage - 7300) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 8800 && wage <= 10050) { 
               taxrate= 0.02;
               withhold = 20;
               double excess = wage - 8800;
               double excesstax = (wage - 8800) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 10050 && wage <= 11200) { 
               taxrate= 0.03;
               withhold = 45;
               double excess = wage - 10050;
               double excesstax = (wage - 10050) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 11200 && wage <= 13500) { 
               taxrate= 0.04;
               withhold = 79.50;
               double excess = wage - 11200;
               double excesstax = (wage - 11200) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 13500 && wage <= 15000) { 
               taxrate= 0.05;
               withhold = 171.50;
               double excess = wage - 13500;
               double excesstax = (wage - 13500) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else { 
               taxrate= 0.0525;
               withhold = 246.50;
               double excess = wage - 15000;
               double excesstax = (wage - 15000) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }     
               
            }
            
           else if (ab.equalsIgnoreCase("B")) {
               if (wage >= 0 && wage <= 12600) { 
               taxrate = 0; 
               withhold = 0;
               System.out.println("your're tax free");
               }
               else if (wage >= 12600 && wage <= 14600) { 
               taxrate= 0.005;
               withhold = 0;
               double excess = wage - 12600;
               double excesstax = (wage - 12600) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 14600 && wage <= 17600) { 
               taxrate= 0.01;
               withhold = 10;
               double excess = wage - 14600;
               double excesstax = (wage - 14600) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 17600 && wage <= 20100) { 
               taxrate= 0.02;
               withhold = 40;
               double excess = wage - 17600;
               double excesstax = (wage - 17600) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 20100 && wage <= 22400) { 
               taxrate= 0.03;
               withhold = 90;
               double excess = wage - 20100;
               double excesstax = (wage - 20100) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 22400 && wage <= 24800) { 
               taxrate= 0.04;
               withhold = 159;
               double excess = wage - 22400;
               double excesstax = (wage - 22400) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else if (wage >= 24800 && wage <= 27600) { 
               taxrate= 0.05;
               withhold = 255;
               double excess = wage - 24800;
               double excesstax = (wage - 24800) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
               else { 
               taxrate= 0.0525;
               withhold = 395;
               double excess = wage - 27600;
               double excesstax = (wage - 27600) * taxrate;
               double total = withhold + excesstax;
               System.out.println("your total amout payable tax is: " + total);
               }
             }

            
            
        
    
    }
 }