/* 
 * Author: Brian Klein
 * Date: 4-1-17
 * Program: Rectangle.java
 * Purpose: user-defined class to create a rectangle object
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Rectangle
{  
      //data members - instance variables
   private double length, width;

      //setters and getters
   public void setLength(double len) {
      length = len;
   }
      
   public void setWidth(double w) {
      width = w;
   }
   
   public double getLength() {
      return length;
   }
   
   public double getWidth() {
      return width;
   }
   
    public double getArea() {
      return length * width;
   }
   
   public double getPerimeter() {
      return (2 * length) + (2 * width);
   }
   
      //two overloaded constructors
   public Rectangle() {
      length = 0;
      width = 0;
   }
   
   public Rectangle(double len, double w) {
      length = len;
      width = w;
   }
   
      //toString method
   public String toString() {
      String str = "\nLength: " + length +
                   "\nWidth: " + width +
                   "\nArea: " + (length * width) +
                   "\nPerimeter: " + ((2 * length) + (2 * width));
                   
      return str;
   }
   
}//end class