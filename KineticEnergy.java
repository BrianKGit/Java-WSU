/* 
 * Author: Brian Klein
 * Date: 2-27-17
 * Program: KineticEnergy.java
 * Purpose: Input mass and velocity of an object.
 *          Then calculate the kinetic energy of 
 *          object and output data. Finally, calculate
 *          average kinetic energy of all objects.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class KineticEnergy 
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare constants
      final double NUM = 0.5, SENTINEL = -1;
      
         //declare variables
      double k, m = 0, v, average, sum = 0;
      int count = 0;
      
      while( m != SENTINEL)//set sentinel
      {
            //input m
         System.out.print("\nEnter the mass of the object in Kilograms ( -1 to exit): ");
         m = console.nextDouble();
         
         if(m == SENTINEL)//check sentinel
         {
               //calculate average
            average = sum / count;
            
               //output average
            System.out.printf("\nThe average kinetic energy is %,.2f", average);
         }// end if
         else if(m <= 0)//validate m
         {
            System.out.print("\nInvalid, mass must be greater than zero.");
         }// end else if
         else
         {
               //input v
            System.out.print("Enter the velocity of the object in meters per second: ");
            v = console.nextDouble();
            
            while(v < 0)//validate v
            {
               System.out.print("\nInvalid, velocity cannot be negative.");
               System.out.print("\nEnter the velocity of the object in meters per second: ");
               v = console.nextDouble();
            }// end while
            
               //increase count
            count ++;
            
               //calculate k
            k = m * (v * v) * NUM;
            
               //increase sum
            sum += k;
            
               //output k
            System.out.printf("\nThe kinetic energy of the object is %,.2f\n", k);
            
         }// end else
         
      }// end while
                        
   }//end main
   
}//end class