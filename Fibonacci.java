/* Author: Brian Klein
 * Date: 3-1-17
 * Program: Fibonacci.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Fibonacci 
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int position, x = 0, p1 = 0, p2 = 1;
      
      System.out.print("Enter a position: ");
      position = console.nextInt();
      
      position = Math.abs(position);
      
      if(position == 0 || position == 1)
         x = position;
         
      for(int i = 2; i<=position; i++)
      {
         x = p1 + p2;
         p1 = p2;
         p2 = x;
      }
      
      System.out.printf("Fibonacci number at position %d is %,d.",position, x);
                
   }//end main
   
}//end class