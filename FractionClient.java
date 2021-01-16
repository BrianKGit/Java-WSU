/* 
 * Author: Brian Klein
 * Date: 4-5-17
 * Program: FractionClient.java
 * Purpose: 
 *          
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class FractionClient
{  
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      Fraction f1, f2, result;
      
      f1 = new Fraction(1, 27);
      f2 = new Fraction(20, 27);
      
      result = f1.add(f2);
      
      System.out.println( f1 + " + " + f2 + " = " + result);
      
         //shallow copy
      //f1 = f2;
      
      f1 = f2.copy(); //deep copy
      
      f1 = new Fraction ( f2 ); //deep copy
      
      if(f1.equals (f2) ) {
         System.out.println("They are equal.");
      }
      else {
         System.out.println("They are not equal.");
      }
      
   }//end main
   
} //end class
   