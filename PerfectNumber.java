/* 
 * Author: Brian Klein
 * Date: 2-22-17
 * Program: PerfectNumber.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class PerfectNumber  
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int n, sum = 0;
      
      System.out.print("Enter a positive integer: ");
      n = console.nextInt();
      
      for( int i = 1; i < n/2; i++)
      {
         if (n % i == 0)  //factor
         {
            sum += i;
         }
      }
      
      if( sum == 0 )
      {
         System.out.println("Yes, " + n + " is a perfect number.");
      }   
      else
      {
         System.out.println("No, " + n + " is not a perfect number.");
      }
   }//end main
   
}//end class