/* 
 * Author: Brian Klein
 * Date: 1/30/17
 * Program: MontereyBeach.java
 * Purpose: Calculate the rental charge, given the type of moped,
 *              when it is rented, and the hours rented
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class MontereyBeach   
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
                  
         //declare variables
      String type, day;
      double hours, extraHours, rentalCharge;
      
         //prompt user to enter type, day, and hours
      System.out.print("Enter type (50cc or 250cc): ");
      type = console.next();
      
      System.out.print("Enter day (weekday or weekend): ");
      day = console.next();
      
      System.out.print("Enter hours: ");
      hours = console.nextDouble();
      
      if(hours <= 0 )
      {
         System.out.println("Invalid, hours must be greater than 0.");
         System.exit(1);
      }
      
         //calculate extra hours
      extraHours = hours - 3.0;
      
      if(hours < 3.0)
      {
         extraHours = 0;
      }
      
      if(type.compareTo("50cc") == 0)
      {
         if(day.compareTo("weekday") == 0)
         {
            rentalCharge = 15;
            
            if(extraHours > 0)
            {
               rentalCharge += extraHours * 2.5;
            }
         }
         else //weekend
         {
            rentalCharge = 30;
            
            if(extraHours > 0)
            {
               rentalCharge += extraHours * 7.5;
            }
         }
      }
      else //250cc
      {
         if(day.equalsIgnoreCase("weekday"))
         {
            rentalCharge = 25;
            
            if(extraHours > 0)
            {
               rentalCharge += extraHours * 3.5;
            }
         }
         else //weekend
         {
            rentalCharge = 35;
            
            if(extraHours > 0)
            {
               rentalCharge += extraHours * 8.5;
            }
         }   
      }
         //output results
      System.out.printf("%nType: " + type + "%n" +
                        "Day: " + day + "%n" +
                        "Hours: " + hours + "%n" +
                        "Rental Charge: $%.2f", rentalCharge);
                        
   }//end main
   
}//end class