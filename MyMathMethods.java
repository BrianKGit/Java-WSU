/* Author: Brian Klein
 * Date: 3-15-17
 * Program: MyMathMethods.java
 * Purpose: This Java program contains several useful math methods
 *          
 *          
 */
  
public class MyMathMethods
{   		
   public static long getFactorial( int n )
   {
      long result = 1;
      
      for(int i = n; i >= 1; i--)
      {
         result = result * i;
      }
      
      return result;
   
   } //end getFactorial method

   public static int getFibonacci(int position)
   {
      int x = 0, p1 = 0, p2 = 1;
      
      for(int i = 2; i<=position; i++)
      {
         x = p1 + p2;
         p1 = p2;
         p2 = x;
      }
         
      return x;
   } //end getFibonacci method
   
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
   
   public static boolean isPerfectNumber( int n )
   {
      int sum = 0;
   
      for( int i = 1; i < n/2; i++)
      {
         if (n % i == 0)  //factor
         {
            sum += i;
         }
      }// end for loop
      
      if( sum == 0 )
      {
         return true;
      }   

      return false;

   
   }//end isPerfectNumber method


   
}//end class