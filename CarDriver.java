/* 
 * Author: Brian Klein
 * Date: 4-2-17
 * Program: CarDriver.java
 * Purpose: Prompt user for car data. Output car data. Call the accelerate
 *          method 10 times. Then, call the breaks method 8 times.          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class CarDriver
{  
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      
         //declare variables
      double mph = 0.0;
      int year, a, b;
      String carMake;
      
      System.out.print("Enter year model: ");
      year = console.nextInt();
      
      System.out.print("Enter make: ");
      carMake = console.next();
      
         // create a car object based on the user input
      Car car = new Car(mph, year, carMake);
      
      System.out.println("\nCurrent status of the car: \n");
      
      System.out.print(car.toString());
      
      System.out.print("\n\nNow the car is accelerating...");
      
         //call accelerate method 10 times
      for(a = 1; a < 11; a++) {
         car.accelerate();
      }
      
      System.out.print("\nAfter accelerating, the current speed is " + car.getSpeed() + " mph.");
      
      System.out.print("\n\nBreaking...");
      
         //call breaks method 8 times
      for(b = 1; b < 9; b++) {
         car.breaks();
      }
      
      System.out.print("\nNow the current speed is " + car.getSpeed() + " mph.");
      
   }//end main
   
}//end class