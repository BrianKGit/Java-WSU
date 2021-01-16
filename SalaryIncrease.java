/* Author: Brian Klein
 * Date: 3-1-17
 * Program: SalaryIncrease.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
import java.io.*;
 
public class SalaryIncrease 
{   		
   public static void main(String[] args) throws IOException
   {
         //create the Scanner object representing the keyboard
         //create a File object and assoiciate it with the data file
      File myFile = new File("employeeData.txt");
      Scanner inFile = new Scanner ( myFile );
      
         //create a FileWriter object and associate it with the output file (true - append)
         //create a PrintWriter object and associate it with the FileWriter object
         //If the output file doesn't exist, it will be created by the program
      FileWriter fw = new FileWriter("employeeData2.txt", false);
      PrintWriter outFile = new PrintWriter( fw );
      
      
         //declare variables
      String firstName, lastName;
      double curSalary, newSalary, rate, curSum = 0, newSum = 0;
      int count = 0;
      
         //read data
      while( inFile.hasNext() )
      {
         firstName = inFile.next();
         lastName = inFile.next();
         curSalary = inFile.nextDouble();
         rate = inFile.nextDouble();
         
            //calculate new salary
         newSalary = curSalary + curSalary * rate/100;
         
         curSum += curSalary;
         newSum += newSalary;
         count ++;
         
         
            //output results to the output file
         outFile.printf( "%-12s %-12s $%-9.2f %-5.2f $%.2f %n",
                          firstName, lastName, curSalary, rate, newSalary );
         
      } //end while
      
      outFile.printf("%nCurrent salary average: $%.2f", curSum/count);
      outFile.printf("%nNew salary average: $%.2f", newSum/count);
      
      inFile.close();
      outFile.close(); //you must close the outFile
          
   }//end main
   
}//end class