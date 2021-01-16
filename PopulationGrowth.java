/* Author: Jim Ma
 * Date: 3-15-17
 * Program: PopulationGrowth.java
 * Description: 
 */

import java.util.Scanner;

public class PopulationGrowth
{
   public static void main( String[] args )
   {
          //create a Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);   
             
          //declare variables
      int popA, popB;
      double growthA, growthB;
      int numOfYears = 0;
      
          //input
      System.out.print("Enter the current population of town A: ");
      popA = console.nextInt();
      
      System.out.print("Enter the current population of town B: ");
      popB = console.nextInt();
      
      System.out.print("Enter the growth rate of town A (%): ");
      growthA = console.nextDouble();
      
      System.out.print("Enter the growth rate of town B (%): ");
      growthB = console.nextDouble();

      while( popA < popB )
      {
          popA = (int) (popA + popA * growthA / 100.0);
      
          popB = (int) (popB + popB * growthB / 100.0);
          
          numOfYears ++;
      }
         //call growthInYears method
      numOfYears = growthInYears( popA, popB, growthA, growthB );
      
      System.out.println("\nNumber of years: " + numOfYears);
      System.out.println("Population of town A: " + popA);
      System.out.println("Population of town B: " + popB);
                          
   } //end main
   
   public static int growthInYears( int popA, int popB, double growthA, double growthB )
   {
      int numOfYears = 0;
   
      while( popA < popB )
      {
          popA = (int) (popA + popA * growthA / 100.0);
      
          popB = (int) (popB + popB * growthB / 100.0);
          
          numOfYears ++;
      }

      return numOfYears;
   
   }//end growthInYears method
     
} //end class
