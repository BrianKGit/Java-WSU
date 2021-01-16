/** @author: Brian Klein
 *  Date: 4-5-17 and 4-12-17
 *  Program: WeeklySpending.java
 *  Purpose: This is a user-defined class
 */

import java.util.Scanner;  //use a Scanner object to represnt the keyboard
import java.util.Random;

public class WeeklySpending
{
   static final int CATEGORY = 3;
   static final int DAYS = 7;
   
   public static void main(String [] args)
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare and create a 2-D srray
      double [] [] table = new double [CATEGORY] [DAYS]; //3 x 7 table
      
      String [] category = {"Food", "Gas", "Miscellaneous"};
      String [] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                             "Thursday", "Friday", "Saturday"};
      
         //get the user input to populate the table
      for(int i=0; i<table.length; i++) {
         
         System.out.println("\nEnter the spending on " + category[i]);
         
         for(int x=0; x<table[i].length; x++) {
         
            System.out.print(dayOfWeek[x] + " spending: $");
            table[i][x] = console.nextDouble();
            
         }//end inner loop
         
      }//end outer loop
      
      printTable(table, category, dayOfWeek);
      
      totalSpendings(table, category);
      
      largestSpendings(table, category);
      
   }//end main
   
   public static void printTable(double [][] table, String[] category, String [] dayOfWeek) {
   
      System.out.printf("%-20s", " "); //print 20 blank spaces
      
      for(int i=0; i<dayOfWeek.length; i++) {
         System.out.print( dayOfWeek[i].substring(0, 3) + "     ");
      }
      
      System.out.println();
      
      for(int i=0; i<table.length; i++) {
         
         System.out.printf("%-17s: ", category[i]);
      
         for(int x=0; x<table[i].length; x++) {
            
            System.out.printf("%7.2f", table[i][x]);
            
         }//end inner
      
         System.out.println();
         
      }//end outer
      
   }//end method
   
      //calculate and print the total spendings
   public static void totalSpendings(double [][] table, String [] category) {
      
      double sum = 0, overall = 0;
      
      for(int i=0; i<table.length; i++) {
         
         sum = 0;
      
         for(int x=0; x<table[i].length; x++) {
         
            sum += table [i][x];
            
         }//end inner
         
         overall += sum;
      
         System.out.printf("%nTotal spending on %s: $%.2f", category[i], sum);
         
      }//end outer
      
      System.out.printf("%nOverall spending: $%.2f", overall);
      
   }//end method
   
      //find and print the largest spendings
   public static void largestSpendings(double [][] table, String [] category) {
      
      double largest;
      
      for(int i=0; i<table.length; i++) {
      
         largest = table[i][0]; //assume the first element is the largest
               
         for(int x=0; x<table[i].length; x++) {
         
            if(largest < table[i][x]) {
               largest = table[i][x];
            }
            
         }//end inner
         
         System.out.printf("%nLargest spending on %s: %.2f", category[i], largest);
         
      }//end outer
      
   }//end method
      
} //end class
