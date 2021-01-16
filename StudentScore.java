/* 
 * Author: Brian Klein
 * Date: 1/23/17
 * Assignment: StudentScore.java
 * Description: 
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class StudentScore
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
            
         //constant
      final int SIZE = 10;
      
         //declare variables
      int score, sum = 0, i;
      double average;
      
      int largest = Integer.MIN_VALUE;
      
      i = 0;
      
      while(i < SIZE)
      {
         System.out.print("Enter a test score for student " + (i+1) + ": ");
         score = console.nextInt();
         
         if(score >= 0 && score <= 100)
         {
            sum += score;
         
            i++;
         
            if(score > largest)
            {
               largest = score;
            }
         }
         else
         {
            System.out.println("\nEnter a valid score (0-100).");
         }
      }
      
      average = sum / (double)SIZE;
      
      System.out.printf("%nThe average score is %.2f", average);
      
      System.out.println("\nThe highest score is " + largest);

   }//end main
   
}//end class