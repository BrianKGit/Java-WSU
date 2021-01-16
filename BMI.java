/* 
 * Author: Brian Klein
 * Date: 2/2/17
 * Program: BMI.java
 * Purpose: Get user input for their height and weight.
 *          Then determine their BMI based on input.
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class BMI   
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      double weight, height, bmi;
      final double CONSTANT = 703;
      
         //user input
      System.out.print("Enter your weight in pounds: ");
      weight = console.nextDouble();
      
      System.out.print("Enter your height in inches: ");
      height = console.nextDouble();
      
      if((height <= 0) || (weight <= 0))
      {
         System.out.print("Invalid, height/weight must be greater than 0.");
         System.exit(1);
      }
      
         //calculate BMI
      bmi = (weight * CONSTANT) / (height * height);
      
         //output BMI
      System.out.printf("Your BMI is: %.1f\n", bmi);
            
   }//end main
   
}//end class