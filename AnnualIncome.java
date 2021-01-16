/* 
 * Author: Brian Klein
 * Date: 1/26/17
 * Assignment: AnnualIncome.java
 * Description: Calculate the revenue for 
 *              each group of museum visitors 
 *              and total museum revenue
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class AnnualIncome
{
      		
   public static void main(String[] args) 
   {
   	
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      double income;
      int age, stringSize;
      String firstName, lastName, streetAdd, city, state, location, bigLoc, tinyLoc;
      char ini1, ini2;
      
         //prompt user for name
      System.out.println( "Please enter your first name: " );
      firstName = console.nextLine();
      
      System.out.println( "Please enter your last name: " );
      lastName = console.nextLine();
      
         //initials
      ini1 = firstName.charAt(0);
      ini2 = lastName.charAt(0);
      
         //prompt user for address and city      
      System.out.println( "Please enter your street address: " );
      streetAdd = console.nextLine();
      
      System.out.println( "Please enter your city: " );
      city = console.nextLine();
      
         //number of letters in city name
      stringSize = city.length();
      
         //prompt user for state
      System.out.println( "Please enter your state: " );
      state = console.nextLine();
      
         //big location and small location
      location = city + ", " + state;
      bigLoc = location.toUpperCase();
      tinyLoc = location.toLowerCase();
      
         //prompt user for age
      System.out.println( "Please enter your age: " );
      age = console.nextInt();
      
         //prompt user for income
      System.out.println( "Please enter your annual income: " );
      income = console.nextDouble();
      
           
         //output
      System.out.println( "User information:");
      System.out.println( "Your Name (last, first): " + lastName + ", " + firstName);
      System.out.println( "Your Initials: " + ini1 + ini2 );
      System.out.println( "Characters in the City Name: " + stringSize );
      System.out.println( "User Location (uppercase): " + bigLoc );
      System.out.println( "User Location (lowercase): " + tinyLoc );
      System.out.println( "Your Age: " + age );
      System.out.printf( "Your Annual Income: $%.2f", income );
   
   }//end main
   
}//end class