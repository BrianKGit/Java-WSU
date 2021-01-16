/* 
 * Author: Brian Klein
 * Date: 2-8-17
 * Program: WhileLoops.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class WhileLoops   
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int n1, n2, i;
      int sum =0, count = 0;
      double average;
      
         //input n1 and n2
      System.out.print("Enter a positive integer: ");
      n1 = console.nextInt();
      
      System.out.print("Enter another positive integer: ");
      n2 = console.nextInt();
      
      i = n1;
      
         //assume n1 is < n2
      while(i < n2)
      {
         System.out.print( i + " " );
         
         sum += i;   //sum = sum + i;
         
         count ++;
         
         if(count % 20 == 0)
         {
            System.out.println();
         }
         
         i++;
      }
      
      average = sum / (double)count;
      
      System.out.printf("%nThe average is %.5f", average);
      
      //another section
      System.out.println();
      
      i = n1;
      sum = 0;
      count = 0;
         //assume n1 is < n2
      while(i < n2)
      {
         if( i%2 !=0) //odd numbers
         {
            System.out.print(i + " ");
            
            sum += i;  //sum = sum + i;
            
            count ++;
         }
         
         if(count % 20 == 0) //new line every 20 integers
         {
            System.out.println();
         }
         
         i++;
      }
      
      average = sum / (double)count;
      
      System.out.printf("%nThe average is %.5f", average);
      
         //infinite loop
      i = 5;
      while( i > 0)
      {
         System.out.println("Hello " + i);
         i++;
      }
                  
   }//end main
   
}//end class