/* 
 * Author: Brian Klein
 * Date: 1/23/17
 * Assignment: Fax.java
 * Description: Calculate cost for international fax
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Fax   
{   		
   public static void main(String[] args) 
   {
   	
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
            
         //declare constants
      final int BASE_PAGES = 10;
      final double SERVICE_CHARGES = 3.00;
      final double COST_PER_PAGE = 0.2;
      final double COST_ADDITIONAL_PAGE = 0.1;
      
         //declare variables
      int numOfPages;
      double cost = 0;
      
         //get user input
      do
      {
         System.out.print("Enter number of pages: ");
         numOfPages = console.nextInt();
      }
      while(numOfPages <= 0 || numOfPages > 100);
      
         //calculate
      if( numOfPages <= 0 )
      {
         System.out.println("Number of pages must be greater than 0.");
         
         System.exit(1); //exit the program
      }
      else
      {
         if( numOfPages <= BASE_PAGES )
         {
            cost = SERVICE_CHARGES + numOfPages * COST_PER_PAGE;
         }
         else //more than 10 pages
         {
            cost = SERVICE_CHARGES + BASE_PAGES * COST_PER_PAGE + (numOfPages - BASE_PAGES) * COST_ADDITIONAL_PAGE;
         }
      
         //outout
         //System.out.println("Cost: $" + cost);
      }
      System.out.printf("Cost: $%.2f", cost);
   
   
   }//end main
   
}//end class