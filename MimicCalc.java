/* 
 * Author: Brian Klein
 * Date: 2/6/17
 * Program: MimicCalc.java
 * Purpose: Mimic a Calculater
 *         
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class MimicCalc   
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
                  
         //declare variables
      double num1, num2, result = 0;
      
      char operation;
      
      System.out.print("Enter the first number");
      num1 = console.nextDouble();
                 
      System.out.print("Enter the operation( +, -, *, / ): ");
      operation = console.next().charAt(0);
      
      System.out.print("Enter second number");
      num2 = console.nextDouble();
      
         //use a switch to determine which operation to operform.
      switch( operation )
      {
         case '+':
            result = num1 + num2;
            break;
            
         case '-':
            result = num1 - num2;
            break;
            
         case '*':
            result = num1 * num2;
            break;
            
         case '/':
            if(num2 == 0)
            {
               System.out.println("Error, cannot divide by zero.");
               System.exit(1);
            }
            else
            {
               result = num1 / num2;
            }
            break;
            
         default:
            System.out.println("Illegal operation.");
         
      }//end switch
      
   System.out.printf("%nThe result is %.2f", result);
            
   }//end main
   
}//end class