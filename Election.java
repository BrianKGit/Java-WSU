/** @author: Brian Klein
 *  Date: 4-5-17 and 4-12-17
 *  Program: Election.java
 *  Purpose: This is a user-defined class
 */

import java.util.Scanner;  //use a Scanner object to represnt the keyboard
import java.util.Random;

public class Election
{
   static final int SIZE = 5;
   
   public static void main(String [] args)
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare and create 2 arrays
      String [] nameList = new String[SIZE];
      int [] voteList = new int [SIZE];
      
         //populate the arrays with user input
      for(int i=0; i<nameList.length; i++) {
         System.out.print("Enter the candidate's name: ");
         nameList[i] = console.next();
         System.out.print("Enter the vote: ");
         voteList[i] = console.nextInt();
      }
      
      int sum = totalVotes( voteList );
      
      for(int i=0; i<nameList.length; i++) {
      
         System.out.printf("%-10s %-8d %-6.2f %n",
                            nameList[i], voteList[i],voteList[i] / (double)sum);
         
      }
      
      System.out.println("\nTotal votes: " + sum);
      
      int winnerIndex = findIndexOfLargest( voteList);
      
      System.out.println("\nThe winner is: " + nameList[winnerIndex] + 
                         " with " + voteList[winnerIndex] + " votes." );
        
   } //end main
   
      //calculate the total votes
   public static int totalVotes( int [] voteList ) {
      
      int sum = 0;
      
      for(int i=0; i<voteList.length; i++) {
         sum += voteList[i];
      }
      
      return sum;
      
   }  //end method
   
      //find the index of the largest vote
   public static int findIndexOfLargest( int [] voteList ) {
      
      int maxIndex = 0; //assume the largest vote is at index 0
      
      for( int i=1; i<voteList.length; i++) {
         
         if(voteList[i] > voteList[maxIndex]) {
            
            maxIndex = i;
            
         }
         
      }
      
      return maxIndex;
   
   } //end method
      
} //end class
