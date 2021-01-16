/** @author: Brian Klein
 *  Date: 4-5-17 and 4-12-17
 *  Program: ArrayProcessing.java
 *  Purpose: This is a user-defined class
 */

import java.util.Scanner;  //use a Scanner object to represnt the keyboard
import java.util.Random;

public class ArrayProcessing
{
   static final int SIZE = 25;
   
   public static void main(String [] args)
   {
     //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      //declare and create an array of int
      int [] myList = new int[SIZE];
    
        //call populateArray method
      populateArray( myList);
         
        //call printArray method
      printArray( myList ); 
      
        //call sumArray method
      System.out.println("\n\nThe sum is " + sumArray( myList ) );     
        
        //call find min method
      int minIndex;
      
      minIndex = findIndexOfSmallest( myList );
      
      System.out.println("\nThe smallest element " + myList[minIndex] + " is at index " + minIndex);
      
      int key;
      
      System.out.print("\nEnter a key to search: ");
      key = console.nextInt();
      
      int foundIndex = sequentialSearch( myList, key );
      
      if(foundIndex != -1) {
         System.out.println("\nFound it at index: " + foundIndex);
      }
      else {
         System.out.println("\nNot Found.");
      }
      

   } //end main 
  
   public static void printArray( int [] myList ) {
      for(int i = 0; i<myList.length; i++ ) {
         System.out.print( myList[i] + " ");
      }
   }     
  
   //populate the array with random numbers
   public static void populateArray( int [] myList ) {
   
    //create a Random object 
      Random rand = new Random();
   
      for(int i = 0; i<myList.length; i++) {
      
         myList[i] =  rand.nextInt( 500 ); //generate a random number between 0 -499
      }
   } 
   
     //calculate the sum of the array elements
   public static int sumArray( int [] myList ) {
   
      int sum = 0;
      
      for(int i = 0; i<myList.length; i++) {
         sum += myList[i];
      }
      
      return sum;
   }      
   
    //find the index of the smallest element
   public static int findIndexOfSmallest( int [] myList ) {
    
      int minIndex = 0; //assume the index 0 has the smallest value
     
      for(int i = 0; i<myList.length; i++) {
         if( myList [i] < myList[minIndex] ) {
            minIndex = i;
         }
      
      }
     
      return minIndex;
   }            
      
     //sequential search to find a particular value in th eelement
   public static int sequentialSearch( int [] myList, int key  ) {
      int sum = 0;
      int foundIndex = -1;
      
      for(int i = 0; i<myList.length; i++) {
         sum += myList[i];
         
         if( key == myList[i] ) {
             foundIndex = i;
             break;
         
         }
      }

      return foundIndex;
   
   }
   
   
   
   
      
      
} //end class
