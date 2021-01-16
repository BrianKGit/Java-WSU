/* 
 * Author: Brian Klein
 * Date: 1/20/17
 * Assignment: Payroll.java
 * Description: 
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Payroll
{
      		
   public static void main(String[] args) 
   {
   	
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declasre constants
      final int REGULAR_HOURS = 40;
      final double OVERTIME_RATE = 1.5;
            
         //declare variables
      double hoursWorked, baseWage, weeklyPay = 0.0;
      String firstName, lastName;
      
         //user input
      System.out.println( "Enter First Name: " );
      firstName = console.next();
   		 
      System.out.println( "Enter Last Name: " );
      lastName = console.next();
      
      System.out.println( "Enter Hours Worked: " );
      hoursWorked = console.nextDouble();
      
      System.out.println( "Enter Base Wage: " );
      baseWage = console.nextDouble();
   
         //calculate
      if( hoursWorked > 0 && baseWage > 0)
      {
         if(hoursWorked <= REGULAR_HOURS)
         {
            weeklyPay = hoursWorked * baseWage;
         }
         else
         {
         weeklyPay = REGULAR_HOURS * baseWage +
                        (hoursWorked - REGULAR_HOURS) * baseWage * OVERTIME_RATE;
         }
             
               
            //print results
         System.out.printf( "%n" + firstName + " " + lastName + ": " +
                           "%nHours Worked: %.2f" +
                           "%nBase Wage: $%.2f" +
                           "%nWeekly Pay: $%.2f" + hoursWorked, baseWage,weeklyPay );
      
      }
      else
      {
         System.out.println("Invalid input.");
      }                    
       
   }//end main
		
}//end class