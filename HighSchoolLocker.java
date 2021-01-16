/* Author: Brian Klein
 * Date: 3-1-17
 * Program: HighSchoolLocker.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class HighSchoolLocker 
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int numOfFactors;
      
      for(int lockerNum =1; lockerNum <= 1000; lockerNum++)
      {
         numOfFactors = 0;
         
         for(int i=1; i<=lockerNum; i++)
         {
            if( lockerNum % i == 0)   //factor
            {
               numOfFactors ++;
            }
         }//end inner loop
         
         if( numOfFactors % 2 != 0)
         {
            System.out.println( lockerNum + " is open.");
         }
         
      } //end outer loop
          
   }//end main
   
}//end class