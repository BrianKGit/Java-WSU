/* 
 * Author: Brian Klein
 * Date: 2/2/17
 * Program: HomeService.java
 * Purpose: Calculate service charge before tax, 
 *          based on user input.
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class HomeService   
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      double hours, charge = 0;
      int serviceNumber;
      final double REGULAR_RATE = 59.99, WEEKEND_RATE = 75.99, EMERGENCY_RATE = 99.99;
      
                //user input for hours
      System.out.print("Enter Hours: ");
      hours = console.nextDouble();
      
      if(hours <= 0)
      {
         System.out.print("Invalid, hours must be greater than zero. ");
         System.exit(1);
      }
     
         //user input for service
      System.out.print("Enter 1 for Regular Service, Enter 2 for Weekend Service, " +
                        "or Enter 3 for Emergency Service: ");
      serviceNumber = console.nextInt();
   
         //switch selection
      switch(serviceNumber)
      {
         case 1:
            System.out.print("You have selected Regular Service. ");
            charge = REGULAR_RATE * hours;
            break;
            
         case 2:
            System.out.print("You have selected Weekend Service. ");
            charge = WEEKEND_RATE * hours;
            break;
            
         case 3:
            System.out.print("You have selected Emergency Service. ");
            charge = EMERGENCY_RATE * hours;
            break;
            
         default:
            System.out.print("Invalid selection, you must enter 1, 2, or 3. ");
            System.exit(1);
      }
      
         //output cost before tax
      System.out.printf("Your charges before taxes will be: $%.2f\n", charge);
            
   }//end main
   
}//end class