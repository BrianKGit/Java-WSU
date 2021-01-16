/* 
 * Author: Brian Klein
 * Date: 1/23/17
 * Assignment: LoanInterest.java
 * Description: 
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class LoanInterest
{   		
   public static void main(String[] args) 
   {
   	
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      final int SENTINEL = -1;
      
         //declare variables
      double principal, rate, interestCharge;
      int days;
      
      int sum = 0, count = 0;
      double average;
      
         //input
      System.out.print("\n\nEnter a loan principal (-1 to exit): ");
      principal = console.nextDouble();
      
      while( principal != SENTINEL)
      {
         System.out.print("Enter interest rate: ");
         rate = console.nextDouble();
         
         System.out.print("Enter a loan term in days: ");
         days = console.nextInt();
         
         if(principal > 0 && rate > 0 && days > 0)
         {
            interestCharge = principal * rate * days / 365;
            
            sum += interestCharge;
            
            count ++;
         
            System.out.printf("%nThe interest is $%.2f", interestCharge);
         }
         else
         {
            System.out.println("Invalid input, try again.");
         }
         
         System.out.print("\n\nEnter a loan principal (-1 to exit): ");
         principal = console.nextDouble();
         
      }//end while
      
      if( count != 0)
      {
         average = sum / count;
         
         System.out.println("\n\nNumber of loans: " + count);
         System.out.printf("%nAverage interest: $%.2f", average);
      }
      
   }//end main
   
}//end class