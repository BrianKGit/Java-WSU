/* 
 * Author: Brian Klein
 * Date: 3-22-17
 * Program: Loan.java
 * Purpose: 
 *          
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Loan 
{  
      //data members - instance variables
   private String name;
   private double interest; //monthly rate
   private int numOfPayments;
   
      //two overloaded constructors
   public
   
   public void setAmount(double a) {
      if(a > 0) {
         amount = a;
      }
      else {
         System.out.println("Invalid, amount cannot be less than 0, try again.");
         amount = 0;
      }
   }
   
   public double getAmount() {
      return amount;
   }
   
   public void setInterest(double r) {
      if( r > 0 ) {
         interest = r;
      }
      else {
         interest = 0;
      }
   
   public double getInterest() {
      return interest;
   }
   
   public void setNumOfPayments( int number ) {
      if( number > 0 ){
         numOfPayments = number;
      }
      else {
         numOfPayments = 0;
      }
   }
   
   public int getNumOfPayments() {

        
   }//end main
   
}//end class