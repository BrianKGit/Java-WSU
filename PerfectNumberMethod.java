/* 
 * Author: Brian Klein
 * Date: 3-15-17
 * Program: PerfectNumberMethod.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class PerfectNumberMethod
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int n, sum = 0;
      
      boolean flag;
      
      System.out.print("Enter a positive integer: ");
      n = console.nextInt();
      
         //call isPerfectNumber method
      flag = isPerfectNumber( n );
            
      if( flag )
      {
         System.out.println("Yes, " + n + " is a perfect number.");
      }   
      else
      {
         System.out.println("No, " + n + " is not a perfect number.");
      }
   }//end main
   
   public static boolean isPerfectNumber( int n )
   {
      int sum = 0;
   
      for( int i = 1; i < n/2; i++)
      {
         if (n % i == 0)  //factor
         {
            sum += i;
         }
      }// end for loop
      
      if( sum == 0 )
      {
         return true;
      }   

      return false;

   
   }//end isPerfectNumber method
   
}//end class