/* 
 * Author: 
 * Date: 
 * Assignment: GuessRandomNumber
 * Description: 
 *              
 */

import java.util.Scanner;
import java.util.Random;

public class GuessRandomNumber
{
   public static void main (String[] args)
   {  
      Scanner console = new Scanner(System.in);
   
          //declare the variables
      int num;       //variable to store the random number
      int guess;     //variable to store the number
                     //guessed by the user
   
      boolean flag;  //boolean variable to control the loop
      
      Random rand = new Random();
      
      num = rand.nextInt(100); //between 0 to 99            
   
      flag = true;                                 
   
      while (flag)                                   
      {                                               
         System.out.print ("Enter an integer greater"
                       + " than or equal to 0 and "
                       + "less than 100: ");        
         guess = console.nextInt();                  
         System.out.println();                       
      
         if (guess == num)                           
         {                                           
            System.out.println("You guessed the "
                            + "correct number.");  
            flag = false;                            
         }                                           
         else if (guess < num)                       
            System.out.println("Your guess is "
                            + "lower than "
                            + "the number.\n"
                            + "Guess again!");     
         else                                        
            System.out.println("Your guess is "
                            + "higher than "
                            + "the number.\n"
                            + "Guess again!");     
      } //end while                                 
   }                                                  
}

