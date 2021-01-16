/* 
 * Author: Brian Klein
 * Date: 3-22-17
 * Program: LoanClient.java
 * Purpose: 
 *          
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class LoanClient 
{  
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      
         //declare variables
      String name;
      double amount, interest; //annual interest rate
      int years; //loan term in years
      
      double monthlyPayment;
      
      Loan carLoan, mortgageLoan;
      
      System.out.print("Enter name: ");
      name = console.nextLine();
      
      System.out.print("Enter loan amount: ");
      amount = console.nextDouble();
      
      System.out.print("Enter annual interest rate: ");
      interest = console.nextDouble();
      
      System.out.print("Enter loan term in years: ");
      years = console.nextInt();
      
         // create a loan object based on the user input
      carLoan = new Loan(name, amount, interest/100/12, years * 12);
      
         //calculate car loan's monthly payment
      monthlyPayment = carLoan.calMonthlyPayment();
      
      System.out.println( carLoan );  //toString method is called
      System.out.printf("Monthly Payment: $%.2f", monthlyPayment);
        
   }//end main
   
}//end class