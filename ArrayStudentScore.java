/** @author: Brian Klein
 *  Date:    4-19-17
 *  Program: ArrayStudentScore.java
 *  Purpose: Allows user to enter students' names followed by their test scores.
 *           Outputs their names and scores, student(s) with the highest score,
 *           class average score, and the students above and below the average.
 */

import java.util.Scanner;  //use a Scanner object to represnt the keyboard

public class ArrayStudentScore
{
   static final int SIZE = 10;
   
   public static void main(String [] args)
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare and create an array for names and scores
      String [] nameList = new String[SIZE];
      double [] scoreList = new double[SIZE];
      
         //get user input to populate name array
      for(int i=0; i<nameList.length; i++) {
         System.out.print("Enter the name of a student: ");
         nameList[i] = console.nextLine();
         
      }//end for
      
         //get user input to populate score array
      for(int i=0; i<scoreList.length; i++) {
         System.out.print("Enter the test score for " + nameList[i] + ": ");
         scoreList[i] = console.nextDouble();
      }//end for
      
         //output names and scores
      for(int i=0; i<nameList.length; i++) {
         System.out.print("\nStudent: " + nameList[i] +
                          "\nScore: " + scoreList[i]);
      }
      
         //call meanArray method
      System.out.println("\n\nThe average test score is: " + meanArray( scoreList ) );     
        
         //call find max method
      int maxIndex;
      
      maxIndex = findIndexOfLargest( scoreList );
      
      System.out.println("\nThe highest test score is: " + scoreList[maxIndex]);
      
      System.out.println("\nThe student(s) with the highest score: ");
      
      for(int i=0; i<nameList.length; i++) {
         if(scoreList[i] == scoreList[maxIndex]) {
            System.out.print(nameList[i] + " ");
         }
      }
      
         //output above average scores
      System.out.println("\nThe students with scores above the class average: ");
      
      for(int i=0; i<scoreList.length; i++) {
         if(scoreList[i] > meanArray( scoreList )) {
            System.out.print("\n" + nameList[i]);
         }//end if
         
      }//end for
       
         //output below average scores
      System.out.println("\nThe students with scores below the class average: ");
      
      for(int i=0; i<scoreList.length; i++) {
         if(scoreList[i] < meanArray( scoreList )) {
            System.out.print("\n" + nameList[i]);
         }//end if
         
      }//end for
      
   } //end main
   
      //calculate the mean of the array elements
   public static double meanArray( double [] scoreList ) {
   
      double sum = 0;
      double mean = 0;
      
      for(int i = 0; i<scoreList.length; i++) {
         sum += scoreList[i];
      }
      
      mean = sum / SIZE;
      
      return mean;
   }      
   
      //find the index of the largest element
   public static int findIndexOfLargest( double [] scoreList ) {
    
      int maxIndex = 0; //assume the index 0 has the largest value
     
      for(int i = 0; i<scoreList.length; i++) {
         if( scoreList [i] > scoreList[maxIndex] ) {
            maxIndex = i;
         }//end if
      
      }//end for
     
      return maxIndex;
   }//end method
   
} //end class
