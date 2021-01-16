/* Author:  Brian Klein
 * Date:    4-23-17
 * Program: CityPrecipitation.java
 * Purpose: Reads data from City_Precipitation_Data.txt,
 *          formats and outputs data. Returns the city
 *          with the most and least precipitation.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
import java.io.*;
 
public class CityPrecipitation 
{   		
   public static void main(String[] args) throws IOException
   {
      
         //declare variables
      final int SIZE = 66;
      double[] precipitation = new double[SIZE];
      String[] cities = new String[SIZE];
      int i = 0;
      
         //create the Scanner object representing the keyboard
         //create a File object and assoiciate it with the data file
      File myFile = new File("City_Precipitation_Data.txt");
      Scanner inFile = new Scanner ( myFile );
      
         //read data
      while( inFile.hasNext() && i < cities.length)
      {
         cities[i] = inFile.next();
         precipitation[i] = inFile.nextDouble();
         
         i++;
         
      }//end while
      
         //print heading
      System.out.print("City            Precipitation in inches\n\n");
      
      for(int n=0; n < cities.length; n++) {
         System.out.printf( "%-15s %-7.2f %n", cities[n], precipitation[n] );
      }
      
         //call find max method
      int maxIndex, minIndex;
      
      maxIndex = findIndexOfLargest( precipitation );
      
      minIndex = findIndexOfSmallest( precipitation );
      
      System.out.println("\nThe city with the highest precipitation is " + cities[maxIndex] +
                         ": " + precipitation[maxIndex]);
      
      System.out.println("\nThe city with the lowest precipitation is " + cities[minIndex] +
                         ": " + precipitation[minIndex]);
      
      inFile.close();
      
   }//end main
   
      //find the index of the largest element
   public static int findIndexOfLargest( double [] precipitaion ) {
    
      int maxIndex = 0; //assume the index 0 has the largest value
     
      for(int i = 0; i<precipitaion.length; i++) {
         if( precipitaion [i] > precipitaion[maxIndex] ) {
            maxIndex = i;
         }//end if
      
      }//end for
     
      return maxIndex;
      
   }//end method
      
      //find the index of the smallest element
   public static int findIndexOfSmallest( double [] precipitaion ) {
    
      int minIndex = 0; //assume the index 0 has the smallest value
     
      for(int i = 0; i<precipitaion.length; i++) {
         if( precipitaion [i] < precipitaion[minIndex] ) {
            minIndex = i;
         }//end if
      
      }//end for
     
      return minIndex;
   }//end method
   
}//end class