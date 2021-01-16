/* 
 * Author: Brian Klein
 * Date: 1/23/17
 * Assignment: StudentScore3.java
 * Description: 
 *              
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class StudentScore3
{   		
   public static void main(String[] args) 
   {
   	
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int score, sum = 0, i;
      double average;
      
      boolean flag = true;
      
      int largest = Integer.MIN_VALUE;
      int smallest = Integer.MAX_VALUE;
      
      i = 0;
           
      while( flag )
      {
      
            //input
         System.out.print("Enter a score (-1 to exit): ");
         score = console.nextInt();
         
         if(score == -1)
         {
            flag = false;
         }
         
         else
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
         }
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