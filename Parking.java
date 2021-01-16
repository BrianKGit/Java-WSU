/* Author: Brian Klein
 * Date: 3-13-17
 * Program: Parking.java
 * Purpose: Calculate the cost of parking,
 *          given the hours parked.
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Parking
{
      //global constants
   static final double BASE_FEE = 2.00;
   static final double BASE_HOURS = 3.0;
   static final double ADDITIONAL_FEE = 0.5;
   static final double MAX_FEE = 10.0;
   static final double MAX_HOURS = 24.0;

   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
         
      double hours, charge;
      
      System.out.print("Enter the hours parked: ");
      hours = console.nextDouble();
      
         //call user-defined method to calculate the parking charge
      
      charge = calculateCharge( hours );
      
         //call user-defined method to print the receipt
      printReceipt( hours, charge );
      
   } //end main
   
      //user-defined method to calculate the charge
   public static double calculateCharge( double hours )
   {
      double fee;
      
      if(hours <= BASE_HOURS )
      {
         fee = BASE_FEE;
      }
      else if( hours <= MAX_HOURS)
      {
         fee = BASE_FEE + ADDITIONAL_FEE * (hours - BASE_HOURS);
      }
      else
      {
         fee = MAX_FEE;
      }
      
      return fee;
   } //end calculateCharge
   
      //user-defined method to print receipt
   public static void printReceipt( double hours, double cost )
   {
      System.out.printf("%nHours parked: %.2f", hours);
      System.out.printf("%nParking charge: $%.2f", cost);
      
      System.out.println("\nThanks for your business.");
      
   }
   
}//end class