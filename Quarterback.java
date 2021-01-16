/* Author: Brian Klein
 * Date: 3-20-17
 * Program: Quarterback.java
 * Purpose: Reads data from quarterback_stats.txt,
 *          formats data and calculates total touchdowns,
 *          passer completion rating, and average passer
 *          completion rating. Places data into 
 *          quarterback_results.txt
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
import java.io.*;
 
public class Quarterback 
{   		
   public static void main(String[] args) throws IOException
   {
         //create the Scanner object representing the keyboard
         //create a File object and assoiciate it with the data file
      File myFile = new File("quarterback_stats.txt");
      Scanner inFile = new Scanner ( myFile );
      
         //create a FileWriter object and associate it with the output file (true - append)
         //create a PrintWriter object and associate it with the FileWriter object
         //If the output file doesn't exist, it will be created by the program
      FileWriter fw = new FileWriter("quarterback_results.txt", false);
      PrintWriter outFile = new PrintWriter( fw );
      
      
         //declare variables
      String firstName, lastName, team;
      double rating, passCompRate = 0, sumCompRate = 0, avgCompRate = 0;
      int games, attempts , completions , yards, touchdowns, totalTouchdowns = 0, count = 0;
      
        //header
      outFile.print("Player                      Team  G   Att  Cmp  Yds   TD  Rating  CmpRate\n");
      
         //read data
      while( inFile.hasNext() )
      {
         firstName = inFile.next();
         lastName = inFile.next();
         team = inFile.next();
         games = inFile.nextInt();
         attempts = inFile.nextInt();
         completions = inFile.nextInt();
         yards = inFile.nextInt();
         touchdowns = inFile.nextInt();
         rating = inFile.nextDouble();
         
            //calculate stats
         passCompRate = (double)completions / attempts * 100;
         totalTouchdowns += touchdowns;
         sumCompRate += passCompRate;
         count ++;
         
         
            //output results to the output file
         outFile.printf( "%-12s %-14s %-5s %-3d %-4d %-4d %-5d %-3d %-7.1f %-7.1f %n",
                          firstName, lastName, team, games, attempts, 
                          completions, yards, touchdowns, rating, passCompRate );
         
         
      } //end while
      
      avgCompRate = sumCompRate/count;
      
      outFile.printf("%nCompletion average of all players: %.2f", avgCompRate);
      outFile.printf("%nTotal number of touchdowns: %d", totalTouchdowns);
      
      inFile.close();
      outFile.close(); //you must close the outFile
          
   }//end main
   
}//end class