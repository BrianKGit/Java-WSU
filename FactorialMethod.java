/* 
 * Author: Brian Klein
 * Date: 3/15/17
 * Assignment: FactorialMethod.java
 * Description: 
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class FactorialMethod  
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
            
         //declare variables
      int n;
      
      long result = 1;
      
         //input n
      System.out.print("Enter a positive integer: ");
      n = console.nextInt();
      
      if( n < 0)
      {
         n = -n; //absolute value of n
      }
      
         //call getFactorial method
      result = getFactorial( n );
            
      System.out.println( n + "! = " + result);
      
   }//end main
   
      // user-defined method to calculate the factorial of n
   
   public static long getFactorial( int n )
   {
      long result = 1;
      
      for(int i = n; i >= 1; i--)
      {
         result = result * i;
      }
      
      return result;

   }
   
}//end class