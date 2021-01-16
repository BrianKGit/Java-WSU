/* 
 * Author: Brian Klein
 * Date: 2/6/17
 * Program: InternetServiceProvider.java
 * Purpose: Mimic a Calculater
 *         
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class InternetServiceProvider   
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
                  
         //declare variables
      char packageNum;
      double hours, charges = 0, extraHours;
      
         //input the package number
      System.out.print("Enter the package number(A, B, or C): ");
      packageNum = console.next().charAt(0);
      
      packageNum = Character.toUpperCase( packageNum );
      
      if( packageNum < 'A' || packageNum > 'C' )
      {
         System.out.println("Invalid package number.");
      }
      else
      {
         //input hours
         System.out.print("Enter hours: ");
         hours = console.nextDouble();
         
         switch( packageNum )
         {
            case 'A':
               extraHours = hours - 10;
               if( hours <= 10)
               {
                  charges = 9.95;
               }
               else
               {
                  charges = 9.95 + (extraHours * 2);
               }
               break;
               
            case 'B':
               extraHours = hours - 20;
               if( hours <= 20)
               {
                  charges = 13.95;
               }
               else
               {
                  charges = 13.95 + extraHours;
               }
               break;
               
            case 'C':
               charges = 19.95;
               break;
               
            default:
               System.out.print("Invalid selection.");
               System.exit(1);
            
         }//end switch
         
         System.out.print("Your charges are: " + charges);
      }
      
   }//end main
   
}//end class