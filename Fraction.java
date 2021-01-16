/* 
 * Author: Brian Klein
 * Date: 3-22-17
 * Program: Fraction.java
 * Purpose: 
 *          
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Fraction
{  
   
      //data members - instance variables
   private int numerator;
   private int denominator;
   
      //default constructor
   public Fraction() {
      this(0, 1);
   }
   
      //overloaded constructor
   public Fraction(int numerator, int denominator) {
      this.numerator = numerator;
      this.denominator = denominator;
   }
   
      //copy constructor
   public Fraction( Fraction other ) {
      this.numerator = other.numerator;
      this.numerator = other.numerator;
   }
   
      //copy method
   public Fraction copy() {
      Fraction copyFraction = new Fraction(this.numerator, this.denominator);
      
      return copyFraction;
   }
   
      //compare two Fraction objects
   public boolean equals(Fraction other) {
      
      if( this.numerator == other.numerator &&
          this.denominator == other.denominator ) {
          
          return true;
      }
      else {
         return false;
      }
   }
   
      //getGCD method
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
   
      //setters and getters
   public void setNumerator(int numerator) {
      this.numerator = numerator;
   }
   
   public int getNumerator() {
      return this.numerator;
   }
   
   public void setDenominator( int denominator ) {
      this.denominator = denominator;
   }
   
   public int getDenominator() {
      return this.denominator;
   }
   
      //add method
   public Fraction add( Fraction other ) {
      
      int n1, d1, n2, d2, resultN, resultD, gcd;
   
      Fraction result;
   
      n1 = this.numerator;
      d1 = this.denominator;
      n2 = other.numerator;
      d2 = other.denominator;
      
      resultN = n1 * d2 + n2 * d1;
      
      resultD = d1 * d2;
      
      gcd = getGCD(resultN, resultD);
      
         //invoke the constructor to create the result object
      result = new Fraction(resultN/gcd, resultD/gcd);
      
      return result;
   }
   
      //override toString method
   public String toString() {
      return numerator + "/" + denominator;
   }
        
}//end class
