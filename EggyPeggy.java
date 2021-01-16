/** @author: Brian Klein
 *  Date: 4-5-17 and 4-12-17
 *  Program: EggyPeggy.java
 *  Purpose: This is a user-defined class
 */

import java.util.Scanner;  //use a Scanner obj

public class EggyPeggy
{
   
   public static void main(String [] args)
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      String input;
      Character temp;
      int i=0;
      
      StringBuilder result;
      
         //input a string
      System.out.print("Enter a string: ");
      input = console.nextLine();
      
         //create a StringBuilder object
      result = new StringBuilder(input);
      
      while( i<result.length()) {
         
         temp = new Character(result.charAt(i));
         
         if(temp.toString().matches("[aeiouAEIOU]")) {
         
            result.insert(i, "egg");
            
            i += 4;
         
         }
         else {
            i++;
         }
      }//end while
      
      System.out.println( result);
      
   }//end main
      
} //end class
