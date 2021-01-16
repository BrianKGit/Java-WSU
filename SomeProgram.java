/* Author: Brian Klein
 * Date: 3-15-17
 * Program: SomeProgram.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class SomeProgram
{
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      int n;
      long result;
      
      System.out.print("Enter n: ");
      n = console.nextInt();
      
         // call getFactorial method in MyMathMethods.java file
      result = MyMathMethods.getFactorial( n );
      
      System.out.println( n + "! = " + result);
      
   } //end main
      
}//end class