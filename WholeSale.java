/* 
 * Author: Brian Klein
 * Date: 2/2/17
 * Program: WholeSale.java
 * Purpose: Get user input for quantity of order.
 *          Then calculate discount and total order
 *          cost after discount.
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class WholeSale   
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      final double PRICE = 25.99;
      double discount, cost, quantity;
      discount = 1;
      
         //get input from user
      System.out.print("Enter Quantity to Purchase: ");
      quantity = console.nextDouble();
      
      if( quantity > 80)
      {
         discount = 0.55;
         System.out.print("Your discount is 45%. ");
      }
      else if(quantity >= 61)
      {
         discount = 0.65;
         System.out.print("Your discount is 35%. ");
      }
      else if(quantity >= 41)
      {
         discount = 0.75;
         System.out.print("Your discount is 25%. ");
      }
      else if(quantity >= 21)
      {
         discount = 0.85;
         System.out.print("Your discount is 15%. ");
      }
      else if(quantity >= 10)
      {
         discount = 0.9;
         System.out.print("Your discount is 10%. ");
      }
      else if(quantity >= 1)
      {
         System.out.print("There is no discount for this quantity. ");
      }
      else
      {
         System.out.print("Invalid, quantity must be 1 or greater. ");
         System.exit(1);
      }
      
         //calculate  and display total cost
      cost = PRICE * quantity * discount;
      System.out.printf("Your total cost is: $%.2f\n", cost);
      
   }//end main
   
}//end class