/* Author: Brian Klein
 * Date: 2-27-17
 * Program: HomeService2.java
 * Purpose: Prompt user for services required and hours for each service.
 *          Calculate the cost of the individual services rendered and
 *          the total cost of all services rendered.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class HomeService2 
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      double totalRegular = 0, totalWeekend = 0, totalEmergency = 0, total = 0;
      double hours, cost = 0;
      int serviceNumber = 1;
      
         //declare constants
      final double REGULAR_RATE = 55.99, WEEKEND_RATE = 75.99, EMERGENCY_RATE = 99.99;
      final int SENTINEL = 0;
      
         //welcome message
      System.out.println("Welcome to Your Friendly Home Service");
      
      while(serviceNumber != SENTINEL)//set sentinel
      {
            //user input for service
         System.out.print("\n*******************************************************\n");
         System.out.print("Enter 1, 2, or 3 to start or 0 to exit.\n\n" +
                          "1 --- Regular Service   $55.99/hour\n" +
                          "2 --- Weekend Service   $75.99/hour\n" +
                          "3 --- Emergency Service $99.99/hour\n" +
                          "0 --- Exit\n\n" +
                          "Select a number: ");
         serviceNumber = console.nextInt();
      
            //switch selection
         switch(serviceNumber)
         {
            case 1:
               System.out.print("You have selected Regular Service ($55.99/hour). \n");
               
                         //user input for hours
               System.out.print("Enter Hours: ");
               hours = console.nextDouble();
            
               if(hours <= 0)//validate hours
               {
                  System.out.print("Invalid, hours must be greater than zero.\n " +
                                   "Please try again\n");
               }
               else
               {
                     //calculate cost
                  cost = REGULAR_RATE * hours;
               
                     //output cost
                  System.out.printf("Your cost before taxes will be: $%.2f\n", cost);
                  
                     //calculate totals
                  totalRegular += cost;
                  total += cost;
                  
               }//end if else
               break;
            
            case 2:
               System.out.print("You have selected Weekend Service ($75.99/hour). \n");
               
                         //user input for hours
               System.out.print("Enter Hours: ");
               hours = console.nextDouble();
            
               if(hours <= 0)//validate hours
               {
                  System.out.print("Invalid, hours must be greater than zero.\n " +
                                   "Please try again\n");
               }
               else
               {
                     //calculate cost
                  cost = WEEKEND_RATE * hours;
               
                     //output cost
                  System.out.printf("Your cost before taxes will be: $%.2f\n", cost);
                  
                     //calculate totals
                  totalWeekend += cost;
                  total += cost;
                  
               }//end if else
               break;
            
            case 3:
               System.out.print("You have selected Emergency Service ($99.99/hour). \n");
               
                         //user input for hours
               System.out.print("Enter Hours: ");
               hours = console.nextDouble();
            
               if(hours <= 0)//validate hours
               {
                  System.out.print("Invalid, hours must be greater than zero.\n " +
                                   "Please try again\n");
               }
               else
               {
                     //calculate cost
                  cost = EMERGENCY_RATE * hours;
               
                     //output cost
                  System.out.printf("Your cost before taxes will be: $%.2f\n", cost);
                  
                     //calculate totals
                  totalEmergency += cost;
                  total += cost;
                  
               }//end if else
               break;
            
            case 0:
               break;
               
            default:
                  //validate switch
               System.out.print("Invalid selection, you must enter 1, 2, 3, or 0. \n" +
                                "Please try again. \n");
               break;
         }//end switch
      
      }//end while
      
      System.out.printf("Total sales(costs) for each type of service provided: \n" +
                        "Regular service: $%.2f\n" +
                        "Weekend service: $%.2f\n" +
                        "Emergency service: $%.2f\n" +
                        "\nOverall sales(costs) of all services provided: $%.2f\n" +
                        "Thank you for using this program!", 
                        totalRegular, totalWeekend, totalEmergency, total);
          
   }//end main
   
}//end class