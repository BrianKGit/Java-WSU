/* 
 * Author: Brian Klein
 * Date: 3-21-17
 * Program: TaxReturnHelp.java
 * Purpose: Input mass and velocity of an object.
 *          Then calculate the kinetic energy of 
 *          object using User-defined Method. Finally, calculate
 *          average kinetic energy of all objects.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class TaxReturnHelp 
{  
      //declare constants
   static final double LOW_RATE = 0.4, HIGH_RATE = 0.7;
   static final int LOW_INCOME = 25000, LOW_TIME = 30, HIGH_TIME = 20;
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      
         //declare variables
      double cost, rate = 0.0;
      double income = 0.0, time = 0.0;
      final int SENTINEL = -999;
      
      while( income != SENTINEL)//set sentinel
      {
            //input income
         System.out.print("\nEnter yearly income ( -999 to exit): ");
         income = console.nextInt();
         
         if(income == SENTINEL)//check sentinel
         {
            
               //end program
            System.out.print("\nThank you for using this program!");
            System.exit(1);
         }// end if
         else if(income <= 0)//validate income
         {
            System.out.print("\nInvalid, income must be greater than zero.");
         }// end else if
         else
         {
               //input rate
            System.out.print("Enter the hourly rate: ");
            rate = console.nextInt();
            
            while(rate <= 0)//validate rate
            {
               System.out.print("\nInvalid, hourly rate must be greater than 0.");
               System.out.print("\nEnter the hourly rate: ");
               rate = console.nextInt();
            }// end while
            
               //input time
            System.out.print("Enter the consulting time in minutes: ");
            time = console.nextInt();
            
            while(time <= 0)//validate time
            {
               System.out.print("\nInvalid, time must be greater than 0.");
               System.out.print("\nEnter the consulting time in minutes: ");
               time = console.nextInt();
            }//end while
         }// end else
         
         cost = billingAmount(income, rate, time);
         System.out.printf("\nThe billing amount is: $%.2f\n", cost);
         
         
         
      }// end while
                        
   }//end main
   
   public static double billingAmount(double income, double rate, double time)
   {
      double cost = 0.0;
      
         //calculate cost
      if(income <= LOW_INCOME)
      {
         if(time <= LOW_TIME)
         {
            cost = 0;
         }
         else
         {
            cost = (rate * LOW_RATE) * ((time - LOW_TIME) / 60);
         }
      }
      else
      {
         if(time <= HIGH_TIME)
         {
            cost = 0;
         }
         else
         {
            cost = (rate * HIGH_RATE) * ((time - HIGH_TIME)/60);
         }
      }
      
      return cost;
   
   }
   
}//end class