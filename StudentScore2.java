/* 
 * Author: Brian Klein
 * Date: 1/23/17
 * Assignment: StudentScore2.java
 * Description: 
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class StudentScore2
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare constant
      final int SENTINEL = -1;
      
         //declare variables
      int score, sum = 0, i;
      double average;
      
      int largest = Integer.MIN_VALUE;
      int smallest = Integer.MAX_VALUE;
      
      i = 0;
      
         //input
      System.out.print("Enter a score (-1 to exit): ");
      score = console.nextInt();
      
      while( score != SENTINEL )
      {
         if( score >= 0 && score <= 100 )
         {
            sum += score;
            i++;
            
            if( score > largest )
            {
               largest = score;
            }
            if( score < smallest )
            {
               smallest = score;
            }
         }
         else
         {
            System.out.println("Invalid score, try again.");
         }
         
         System.out.print("Enter a score (-1 to exit): ");
         score = console.nextInt();

      }//end while loop
      
      System.out.println("\nTotal number of students: " + i );
      
      if( i !=0 )
      {
         average = sum / (double) i;
         System.out.printf("%nClass average: %.2f", average);
         System.out.println("\nThe highest score: " + largest);
         System.out.println("\nThe lowest score: " + smallest);
      }  
      
   }//end main
   
}//end class