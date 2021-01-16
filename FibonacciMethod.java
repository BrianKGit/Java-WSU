/* Author: Brian Klein
 * Date: 3-15-17
 * Program: FibonacciMethod.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class FibonacciMethod 
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int position, x = 0;
      
      System.out.print("Enter a position: ");
      position = console.nextInt();
      
      position = Math.abs(position);
      
      if(position == 0 || position == 1)
         x = position;
         
         //call getFibonacci method
      x = getFibonacci( position );
            
      System.out.printf("Fibonacci number at position %d is %,d.",position, x);
                
   }//end main
   
   public static int getFibonacci(int position)
   {
      int x = 0, p1 = 0, p2 = 1;
      
      for(int i = 2; i<=position; i++)
      {
         x = p1 + p2;
         p1 = p2;
         p2 = x;
      }
         
      return x;
   }
   
}//end class