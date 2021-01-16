/* 
 * Author: Brian Klein
 * Date: 2/22/17
 * Assignment: Factorial2.java
 * Description: 
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Factorial2  
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
            
         //declare variables
      int n, i;
      
      long result = 1;
      
         //input n
      System.out.print("Enter a positive integer: ");
      n = console.nextInt();
      
      if( n < 0)
      {
         n = -n; //absolute value of n
      }
      
      i = n;
      
      do
      {
         result = result * i;
         i--;
      } 
      while( i >= 1 );
      
      System.out.println( n + "! = " + result);

   }//end main
   
}//end class