/* 
 * Author: Brian Klein
 * Date: 4-1-17
 * Program: Circle.java
 * Purpose: user-defined class to create a circle object
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Circle
{  
      //data members - instance variables
   private double radius;

      //setters and getters
   public void setRadius(double rad) {
      radius = rad;
   }
   
   public double getRadius() {
      return radius;
   }
   
   public double getCircumference() {
      return 2 * Math.PI * radius;
   }   
   
   public double getArea() {
      return Math.PI * radius * radius;
   }
   
      //two overloaded constructors
   public Circle() {
      radius = 0;
   }
   
   public Circle(double rad) {
      radius = rad;
   }
   
      //toString method
   public String toString() {
      String str = "\nRadius: " + radius +
                   "\nArea: " + (Math.PI * radius * radius) +
                   "\nCircumference: " + (2 * Math.PI * radius);
                 
      return str;
   }
   
}//end class