/* Author: Brian Klein
 * Date: 3-13-17
 * Program: Palindrome.java
 * Purpose: Given side 1 and side 2 of a right triangle,
 *          the program calculates the hypotenuse
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Palindrome
{
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
   
      String input;
      boolean flag;
      
      while(true)
      {
         System.out.print("Enter a string (end to stop the program): ");
         input = console.nextLine();
      
         input = input.toLowerCase();
         
         if( input.equals( "end" ) )
         {
            break;
         }
      
         input = input.replaceAll("\\W", "" );  //remove spaces and punctuations
      
            //call user-defined method to determine whether or not
            //the input is a palindrome
         flag = isPalindrome( input );
      
         if(flag)
         {
            System.out.println("Yes, it is a palindrome.");
         }
         else
         {
            System.out.println("No, it is not a palindrome.");
         }
      }
      
   } //end main
      
      //user-defined method to determine the palindrome
   public static boolean isPalindrome( String input )
   {
      int length, i, j;
      
      length = input. length(); //size of input
      
      j = length - 1;
      
      for(i = 0; i <= length / 2; i++)
      {
         if( input.charAt(i) == input.charAt(j) )
         {
            j--;
         }
         else
         {
            return false; //end method 
         }
         
      }// end for
      
      return true;
      
   }
}//end class