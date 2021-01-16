/* 
 * Author: Brian Klein
 * Date: 1/20/17
 * Assignment: #1 FixErrorsAndFormat.java
 * Description: 
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class FixErrorsAndFormat
{
      		
   public static void main(String[] args) 
   {
   	
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare constants
      int SECRET;
      SECRET = 11;
      double RATE;
      RATE = 12.50;
      
         //declare variables
      int num1, num2, newNum;
      String name;
      double hoursWorked, wages;
    
      System.out.println( "Enter num1: " );
      num1 = console.nextInt();
   		 
      System.out.println( "Enter num2: " );
      num2 = console.nextInt();
      
      System.out.println( "The value of num1 = " + num1);
      
      System.out.println( "The value of num2 = " + num2);
   
         //calculate
      newNum = num1 * 2 + num2;
      System.out.println( "The value of newNum = " + newNum);
      
      newNum = newNum + SECRET;
      System.out.println( "The value of newNum = " + newNum);
      
         //user input
      System.out.println( "Enter last name: " );
      name = console.next();
      
      System.out.println( "Enter Hours Worked: " );
      hoursWorked = console.nextDouble();
      
         //calculate wages
      wages = RATE * hoursWorked;
      
         //print results
      System.out.println("Name: " + name);
      System.out.println("Pay Rate: $ " + RATE);
      System.out.println("Hours Worked: " + hoursWorked);
      System.out.println("Salary: $ " + wages);
       
   }//end main
		
}//end class