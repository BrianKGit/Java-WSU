/* 
 * Author: Brian Klein
 * Date: 2/2/17
 * Program: IntegerDivision.java
 * Purpose: Determine if an integer is greater, less than, or 
 *          equal to another integer. Then determine if the 
 *          first integer is divisable by the second integer.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class IntegerDivision   
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int n1, n2;
      
         //prompt user for input
      System.out.println("Enter n1: ");
      n1 = console.nextInt();
      
      System.out.println("Enter n2: ");
      n2 = console.nextInt();
      
         //calculate and output
      if( n1 < n2)
      {
         System.out.printf("%d is less than %d\n", n1, n2);
         System.out.printf("%d is not divisable by %d\n", n1, n2);
      }
      else if(n1 > n2)
      {
         System.out.printf("%d is greater than %d\n", n1, n2);
         
         if(n1 % n2 == 0)
         {
            System.out.printf("%d is divisable by %d\n", n1, n2);
         }
         else
         {
            System.out.printf("%d is not divisable by %d\n", n1, n2);
         }
      }
      else
      {
         System.out.printf("%d is equal to %d\n", n1, n2);
         System.out.printf("%d is divisable by %d\n", n1, n2);
      }
      
   }//end main
   
}//end class