/* 
 * Author: Brian Klein
 * Date: 2/22/17
 * Assignment: Factorial3.java
 * Description: 
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Factorial3  
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
            
      for(int i = n; i >= 1; i--)
      {
         result = result * i;
      }
      
      System.out.println( n + "! = " + result);
      
   }//end main
   
}//end class