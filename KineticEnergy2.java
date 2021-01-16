/* 
 * Author: Brian Klein
 * Date: 3-21-17
 * Program: KineticEnergy2.java
 * Purpose: Input mass and velocity of an object.
 *          Then calculate the kinetic energy of 
 *          object using User-defined Method. Finally, calculate
 *          average kinetic energy of all objects.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class KineticEnergy2 
{  
      //declare constants
   static final double NUM = 0.5, SENTINEL = -1;
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      
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
            
               //call calcKinNRG method
            k = calcKinNRG( m, v );
            
               //increase sum
            sum += k;
            
               //output k
            System.out.printf("\nThe kinetic energy of the object is %,.2f\n", k);
            
         }// end else
         
      }// end while
                        
   }//end main
   
   public static double calcKinNRG(double m, double v)
   {
      double k; //to hold k
      
         //calculate k
      k = m * (v * v) * NUM;
      
      return k;
   
   } //end calcKinNRG method
   
}//end class