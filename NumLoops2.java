/* 
 * Author: Brian Klein
 * Date: 3-16-17
 * Program: NumLoops2.java
 * Purpose: Prompt user for two integers. Output
 *          all even numbers between the two numbers.
 *          Output the sum of all the odd numbers between
 *          the two numbers. Output all numbers and their 
 *          squares betweem 1 and 10. Output the sum of
 *          the squares of all the even numbers between
 *          the two numbers. Output all the lowercase letters.
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class NumLoops2  
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int firstNum, secondNum, i, ii, sum = 0, count = 0, num = 0, sqNum, evenSum = 0;
      char letter = 97;
      
         //input first number
      System.out.print("Enter first number: ");
      firstNum = console.nextInt();
      
      if(firstNum < 0)//validate first number
      {
         firstNum = Math.abs( firstNum ); // absolute value
      }//end if
      
      i = firstNum;
      ii = firstNum;
      
         //input second number
      System.out.print("\nEnter second number: ");
      secondNum = console.nextInt();
      
      if(secondNum < 0)//validate second number
      {
         secondNum = Math.abs( secondNum );//absolute value
      }//end if
      
      while(secondNum < firstNum)//while loop to check firstNum < secondNum
      {
         System.out.print("\nInvalid, second number must be larger than first number." +
                          " Try again.");
         
         System.out.print("\nEnter second number: ");
         secondNum = console.nextInt();
         
         if(secondNum < 0)
         {
            secondNum = Math.abs( secondNum );//absolute value
         }//end if
      }//end while
      
         //output
      System.out.printf("Even numbers between %d and %d are:\n", firstNum, secondNum);
      
      do
      {  
         count ++; //increase count
         
         if(count % 20 == 0)//new line for too many numbers
         {
            System.out.println();
         }//end if
         if( i%2 == 0)//even numbers
         {
            System.out.print( i + " ");
            evenSum += (i * i);//sum of squares of even numbers
         }//end if
         i ++; //increase i
      }while( i <= secondNum ); //end do...while loop
      
      for( ii = 0; ii <= secondNum; ii++ )
         {
            if( ii%2 != 0)//odd numbers
            {
               sum += ii; // sum = sum + ii
            }//end if
         }//end for loop
      
         //output sum of odd numbers
      System.out.printf("%nSum of odd numbers between %d and %d = %d",
                         firstNum, secondNum, sum);
      
      System.out.print("\nNumber      Square of the Number\n");
      
      while(num < 10)// 1 - 10 and squares
      {
         num ++;
         sqNum = num * num;
         System.out.print( num + "              " + sqNum + "\n");
      }//end while
      
         //output sum of squares of even numbers
      System.out.printf("\nSum of the squares of even integers between %d and %d = %d", 
                        firstNum, secondNum, evenSum);
                        
      System.out.println("\nLower case letters are: ");
      
      while(letter < 123) //loop for lower case letters
      {
         System.out.print(letter + " ");
         letter ++;
      }//end while
                        
   }//end main
   
}//end class