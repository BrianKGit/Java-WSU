/* 
 * Author: Brian Klein
 * Date: 1/23/17
 * Assignment: FormatOutput.java
 * Description: Calculate cost for international fax
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class FormatOutput   
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
            
      int id = 123450;
      String name = "Laptop Computer";
      int number = 250;
      double price = 890.00;
      double discountRate = 12.5;
      
      System.out.printf("%n %-8d %-18s %-6d $%-8.2f $%-5.2f%s",
                     id, name, number, price, discountRate, "%");
                     
    }//end main
   
}//end class