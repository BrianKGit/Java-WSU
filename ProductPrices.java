/* 
 * Author: Brian Klein
 * Date: 2-27-17
 * Program: ProductPrices.java
 * Purpose: Prompt user for the price of five objects.
 *          Calculate and output average price of
 *          objects. Output highest and lowest prices.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class ProductPrices 
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int count = 0;
      double price, sum, avgPrice; 
      double highPrice = Double.MIN_VALUE, lowPrice = Double.MAX_VALUE;
      
         //declare constants    
      final double X = 5;
      
      sum = 0; //initialize sum
      
      while(count < 5)
      {   
            //input price
         System.out.println("Enter a product price: ");
         price = console.nextDouble();
         
         if(price < 0)//validate price
         {
            System.out.print("\nInvalid, price cannot be negative. Please try again\n");
         }//end if
         else
         {
            if(price < lowPrice)//set low price
            {
               lowPrice = price;
            }//end if
            if(price > highPrice)//set high price
            {
               highPrice = price;
            }//end if
            
            sum += price;//sum = sum + price
         
            count ++;//increase count
         }//end else
      }//end while
      
         //calculate average price
      avgPrice = sum / X;
      
         //output average price
      System.out.printf("\nThe average price of products is $%.2f", avgPrice);
      
         //output highest price
      System.out.printf("\nThe highest price is $%.2f", highPrice);
      
         //output lowest price
      System.out.printf("\nThe lowest price is $%.2f", lowPrice);
                        
   }//end main
   
}//end class