/* Author: Brian Klein
 * Date: 4-12-17
 * Program: CashRegister.java
 * Purpose: Prompt user for items to purchase, cost of items, 
 *          and quantity to purchase. Calculate cost before and
 *          after tax is added for each set of items. Print
 *          a receipt of all the items purchased along with
 *          total cost before and after taxes.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class CashRegister 
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare 
      int option = 1, quantity;
      double price, total = 0, totalWithTax, totalBeforeTax = 0;
      String name;
      
      Product item = new Product();
      
      String receipt = "";
      
         //declare constants
      final int SENTINEL = 0;
      final double TAX = 0.0675;
      
      while(option != SENTINEL)//set sentinel
      {
         
            //user input for service
         System.out.print("\n******************** CASH REGISTER ********************\n");
         System.out.print("1 --- Purchase\n" +
                          "2 --- Check Out (Print Receipt)\n" +
                          "0 --- Exit\n" +
                          "*******************************************************\n" +
                          "Select an option: ");
         option = console.nextInt();
      
            //switch selection
         switch(option)
         {
            case 1:
                  //user input
               System.out.print("Enter Product Name: ");
               name = console.next();
               
               System.out.print("Enter Product Unit Price: $");
               price = console.nextDouble();
            
               System.out.print("Enter Quantity: ");
               quantity = console.nextInt();
               
                  //create product
               item = new Product(price, quantity, name);
               
               receipt += item;
               
                  //call toString
               System.out.print(item.toString());
               
                  //output price before tax
               System.out.print("\nPrice before tax: $" + item.priceBeforeTax());
               
                  //output tax rate
               System.out.print("\nSales tax rate: " + TAX + "%");
               
                  //output price after tax
               System.out.print("\nPrice after tax: $" + item.priceAfterTax());
               
                  //add to total
               totalBeforeTax += (price * quantity);
               
               break;
               
            case 2:
               System.out.print("\n\n----------Receipt--------------------\n");
               
               totalWithTax = totalBeforeTax * (1 + TAX);
               
                  //call toString for items purchased
               System.out.print(receipt);
               
               System.out.printf("\nTotal price before tax: $%.2f", totalBeforeTax);
               
                  //output tax rate
               System.out.print("\nSales tax rate: " + TAX + "%");
               
                  //output price after tax
               System.out.printf("\nPrice after tax: $%.2f", totalWithTax);
               
               break;
            
            case 0:
               break;
               
            default:
                  //validate switch
               System.out.print("Invalid selection, you must enter 1, 2, or 0. \n" +
                                "Please try again. \n");
               break;
         }//end switch
      
      }//end while
          
   }//end main
   
}//end class