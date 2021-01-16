/* 
 * Author: Brian Klein
 * Date: 2/1/17
 * Program: ExpressimoDelivery.java
 * Purpose: 
 *
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class ExpressimoDelivery   
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
                  
         //declare variables
      String type, service;
      double ounces, pounds, charge;
      
         //input
      System.out.print("Enter package type (letter or box): ");
      type = console.next().toLowerCase();
      
      if( !(type.equals("letter") || type.equals("box") )
      {
         System.out.println("Invalid type.");
         System.exit(1);
      }
      
      System.out.print("Enter service type (Priority, Standard, or 2-Day): ");
      service = console.next().toLowerCase();
      
      if( type.equals("letter") && service.equals("2-day") )
      {
         System.out.println("2-day service for letters not available.");
         System.exit(1);
      }
      
      if( !(service.equals("priority")) || !(service.equals("standard")) || 
         !(service.equals("2-day")) )
      {
      System.out.print("Unknown Service.");
      System.exit(1);
      }
      
      System.out.print("Enter package weight in ounces: ");
      ounces = console.nextDouble();
      
      if( type.equals("letter") && ounces > 8.0)
      {
         System.out.println("Ounces must be 8 ounces or less.");
         System.exit(1);
      }
      
      if( type.equals("letter") && ounces <= 0.0)
      {
         System.out.println("Ounces must be greater than 0.")
         System.exit(1)
      }
      
         //calculate charge
      pounds = ounces / 16.0
      
      if( type.equals("letter") )
      {
         if(service.equals("priority"))
         {
            charge = 12.0;
         }
         else
         {
            charge = 10.5;
         }
      }
      else //box
      {
         if(service.equals("priority")
         {
            charge = 15.75;
            
            if(pounds > 1)
            {
               charge += pounds * 1.25;
            }
         }
         else if(service.equals("standard"))
         {
            charge = 13.75;
            
            if(pounds > 1)
            {
               charge += pounds * 1.0;
            }
         }
         else //2-day
         {
            charge = 7.0;
            
            if(pounds > 1)
            {
               charge += pounds * 0.5;
            }
         }
      }
      
      System.out.printf("The charge is $%.2f", charge);
                              
   }//end main
   
}//end class