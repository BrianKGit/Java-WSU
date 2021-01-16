/* 
 * Author: Brian Klein
 * Date: 3-22-17
 * Program: ShadedRegion.java
 * Purpose: 
 *          
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class ShadedRegion
{  
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
      
         //declare variables
      double len, w, rad, shadedArea; 
      
      Circle circumference, area;
      
      Rectangle perimeter, area;
      
      System.out.print("Enter length of box object: ");
      len = console.nextDouble();
      
      System.out.print("Enter width of box object: ");
      w = console.nextDouble();
      
      System.out.print("Enter radius of circle object: ");
      rad = console.nextInt();
      
         // create a circle object based on the user input
      Circle cir = new Circle(rad);
      
         // create a rectangle object based on the user input
      Rectangle box = new Rectangle(len, w);
      
         //calculate shaded region
      shadedArea = circle.getArea() - rectangle.getArea();
      
      System.out.println("");  //toString method is called
      System.out.printf("\nThe size of the shaded region is: %.2f", shadedArea);
        
   }//end main
   
}//end class