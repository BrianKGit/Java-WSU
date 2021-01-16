/* 
 * Author: Brian Klein
 * Date: 3-15-17
 * Program: GCDMethod.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class GCDMethod
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int r, m, n, temp, result = 1;
      
      System.out.print("Enter an integer: ");
      m = console.nextInt();
      
      System.out.print("Enter another integer: ");
      n = console.nextInt();
      
      result = getGCD( m, n );
      
      System.out.print("GCD is " + result);
                  
   }//end main
   
      //user-defined methed
   public static int getGCD( int m, int n )
   {
      int temp, r, result = 1;
      
      m = Math.abs( m );   //absolute value
      n = Math.abs( n );
      
      if(m == n)
      {
         return m;
      }
      
      if( m < n )
      {
         //swap
         temp = m;
         m = n;
         n = temp;
      }
      
      while(true)
      {
         r = m % n;
         
         if( r != 0)
         {   
            m = n;
            n = r;
         }   
         else //r == 0
         {
            return n;
         }
         
      }//end while
   
   }//end getGCD method
   
}//end class