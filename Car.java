/* 
 * Author: Brian Klein
 * Date: 4-1-17
 * Program: Car.java
 * Purpose: user-defined class to create a car object
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Car
{  
      //data members - instance variables
   private double speed;
   private int yearModel;
   private String make;
   private final double AB = 5.0; //accelerate and breaks unit

      //setters and getters
   public void setSpeed(double mph) {
      speed = mph;
   }
      
   public void setYearModel(int year) {
      yearModel = year;
   }
   
   public void setMake(String carMake) {
      make = carMake;
   }
   
   public double getSpeed() {
      return speed;
   }
   
   public int getYearModel() {
      return yearModel;
   }
   
   public String getMake() {
      return make;
   }
   
      //accelerate method
   public void accelerate() {
      speed += AB;
   }
   
      //breaks method
   public void breaks() {
      if(speed >= 5.0) {
         speed -= AB;
      }
      else {
         speed = 0.0;
      }
   }
   
      //two overloaded constructors
   public Car() {
      speed = 0.0;
      yearModel = 0;
      make = "N/A";
   }
   
   public Car(double mph, int year, String carMake) {
      speed = mph;
      yearModel = year;
      make = carMake;
   }
   
      //toString method
   public String toString() {
      String str = "\nSpeed: " + speed + "mph" +
                   "\nYear: " + yearModel +
                   "\nMake: " + make;
                   
      return str;
   }
   
}//end class