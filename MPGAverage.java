/* 
 * Author: Brian Klein
 * Date: 1/26/17
 * Assignment: MPGAverage.java
 * Description: Asks user to enter a car's miles-per-gallon (MPG). 
 *              Then the program tells the user if the car is 
 *              above or below the national average MPG.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class MPGAverage
{
      		
   public static void main(String[] args) 
   {
   	
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      double mPG, NATIONAL_AVERAGE;
      
         //constant      
      NATIONAL_AVERAGE = 24.00;
      
         //prompt user for car's MPG
      System.out.println("Enter your car's miles-per-gallon: " );
      mPG = console.nextDouble();
      
      if (mPG < 0)
         mPG = mPG * -1.00;
      
      System.out.println("The absolute value of your car's MPG is " + mPG);
      
      if (mPG >= NATIONAL_AVERAGE)
      {
         System.out.printf("Your car's MPG [%.1f] is greater than the national average [%.1f].\n",
                            mPG, NATIONAL_AVERAGE);
      }
      else
      {
         System.out.printf("Your car's MPG [%.1f] is less than the national average [%.1f].\n",
                            mPG, NATIONAL_AVERAGE);
      }
                            
   }//end main
   
}//end class