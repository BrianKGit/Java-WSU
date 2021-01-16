/* 
 * Author: Brian Klein
 * Date: 1/23/17
 * Assignment: MilkCartonWithMethod.java
 * Description: Calculate milk profits
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class MilkCartonWithMethod
{
      //declare global constants
   static final double CARTON_CAPACITY = 3.78;
   static final double COST_ONE_LITER = 0.38;
   static final double PROFIT_ONE_CARTON = 0.27;		
      
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      double cartons, cost, milkQuantity, profit;
      
         //user input
      
      System.out.println( "Enter number of Studio Apartments: " );
      stud = console.nextInt();
      
      System.out.println( "Enter number of One-Bedroom Apartments: " );
      bed1 = console.nextInt();
      
      System.out.println( "Enter number of Two-Bedroom Apartments: " );
      bed2 = console.nextInt();
      
         //calculate
      if( milkQuantity > 0 )
      {
         cartons = (int) (milkQuantity / CARTON_CAPACITY + 0.5);
         cost = milkQuantity * COST_ONE_LITER;
         profit = cartons * PROFIT_ONE_CARTON;
      
            //print results
         System.out.println("/nCartons: " + cartons);
         System.out.printf("Cost: $%.2f ", cost);
         System.out.printf("%nProfit: $%.2f ", profit);
         
      } //end if
      
      else
      {
         System.out.println("Invalid input, milk quantity must be greater than 0.");
      }   
   }//end main
   
}//end class