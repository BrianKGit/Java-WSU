/* 
 * Author: Brian Klein
 * Date: 2/6/17
 * Program: GradeSwitch.java
 * Purpose: Mimic a Calculater
 *         
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class GradeSwitch   
{   		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
                  
         //declare variables
      int score;
      
      char grade = 'U';
      
      System.out.print("Enter the test score.");
      score = console.nextInt();
      
      if(score < 0 || score > 100)
      {
         System.out.print("Invalid test score.");
         System.exit(1);
      }
      
      switch( score / 10)
      {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            grade = 'F';
            
            break;
            
         case 6:
            grade = 'D';
            
            break;
            
         case 7:
            grade = 'C';
            
            break;
            
         case 8:
            grade = 'B';
            
            break;
            
         case 9:
         case 10:
            grade = 'A';
            
            break;
            
         default:
            System.out.println("Invalid test score.");
            
      }//end switch
      
      if(grade != 'U')
      {
         System.out.println("The grade is " + grade + "." );
      }
      
   }//end main
   
}//end class