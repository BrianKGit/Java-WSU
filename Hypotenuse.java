/* Author: Brian Klein
 * Date: 3-1-17
 * Program: Hypotenuse.java
 * Purpose: Given side 1 and side 2 of a right triangle,
 *          the program calculates the hypotenuse
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Hypotenuse
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      double side1, side2, side3;
      
      while(true)
      {
      
         System.out.print("\n\nEnter side 1(-1 to end):");
         side1 = console.nextDouble();
         
         if(side1 == -1)
         {
            break;
         }
      
         System.out.print("Enter side 2:");
         side2 = console.nextDouble();
      
            //call a user-defined method to calculate side3
         side3 = calculateHypotenuse( side1, side2  );
      
            //print results
         System.out.printf("%n%nSide 3: %.2f", side3);
      
      } //end while
       
   }//end main
   
      //user-defined method to calculate side 3
   public static double calculateHypotenuse(double side1, double side2)
   {
      double side3;
      
      side3 = Math.sqrt( Math.pow(side1, 2) + Math.pow( side2, 2) );
      
      return side3;   //return result to the caller
   
   } //end calculateHypotenuse
   
}//end class