/** @author: Brian Klein
 *  Date:    4-12-17
 *  Program: ArrayNumList.java
 *  Purpose: Declares an array of 100 elements. Initializes array with random
 *           numbers between 1 and 500. Returns the mean of the elements.
 *           Returns the standard deviation of the elements. Returns the
 *           index of the largest element in the array.
 */

import java.util.Scanner;  //use a Scanner object to represnt the keyboard
import java.util.Random;

public class ArrayNumList
{
   static final int SIZE = 100;
   
   public static void main(String [] args)
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare and create an array of int
      int [] numList = new int[SIZE];
    
         //call populateArray method
      populateArray( numList);
      
      System.out.println("Elements in an array of 100 organized by 10:");
         
         //call printArray method
      printArray( numList ); 
      
         //call meanArray method
      System.out.println("\n\nThe mean is " + meanArray( numList ) );     
        
         //call find max method
      int maxIndex;
      
      maxIndex = findIndexOfLargest( numList );
      
      System.out.println("\nThe largest element " + numList[maxIndex] + " is at index " + maxIndex);
      
         //call standard deviation
      double mean = 0, stanDev;
      
      stanDev = standardDeviation(numList, mean);
      
      System.out.printf("The standard deviation is %.2f", stanDev);
       
   } //end main 
  
   public static void printArray( int [] numList ) {
      for(int i = 0; i<numList.length; i++ ) {
         
         if(i % 10 == 0)//new line for every 10 numbers
         {
            System.out.println();
         } //end if
         
         System.out.print( numList[i] + " ");
      
      }
   }     
  
      //populate the array with random numbers
   public static void populateArray( int [] numList ) {
   
         //create a Random object 
      Random rand = new Random();
   
      for(int i = 1; i<numList.length; i++) {
      
         numList[i] =  rand.nextInt( 500 ); //generate a random number between 1 - 500
      }
   } 
   
      //calculate the mean of the array elements
   public static double meanArray( int [] numList ) {
   
      int sum = 0;
      double mean = 0;
      
      for(int i = 0; i<numList.length; i++) {
         sum += numList[i];
      }
      
      mean = sum / SIZE;
      
      return mean;
   }      
   
      //find the index of the largest element
   public static int findIndexOfLargest( int [] numList ) {
    
      int maxIndex = 0; //assume the index 0 has the largest value
     
      for(int i = 0; i<numList.length; i++) {
         if( numList [i] > numList[maxIndex] ) {
            maxIndex = i;
         }
      
      }
     
      return maxIndex;
   }            
      
      //method to calculate standard deviation
   public static double standardDeviation( int [] numList, double mean) {
      double sum = 0, stanDev = 0;
      
      for(int i = 0; i<numList.length; i++) {
         sum += Math.pow(numList[i] - mean, 2);
         
      }
      
      stanDev = Math.sqrt(sum / numList.length);
   
      return stanDev;
   
   }
   
} //end class
