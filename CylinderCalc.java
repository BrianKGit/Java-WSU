/* 
 * Author: Brian Klein
 * Date: 1/26/17
 * Assignment: CylinderCalc.java
 * Description: Prompt user for radius and height of a cylinder, 
 *              then calculate and output volume and surface area
 */
 
import javax.swing.JOptionPane;  //import JOptionPane
 
public class CylinderCalc
{
      		
   public static void main(String[] args) 
   {
      
         //declare variables
      double radius, height, volume, surfaceArea;
      String inputString;
      
         //get radius of cylinder
      inputString =
         JOptionPane.showInputDialog(null, "Enter radius of cylinder: " );
      
         //convert string to double   
      radius = Double.parseDouble(inputString);
      
         //get height of cylinder
      inputString =
         JOptionPane.showInputDialog(null, "Enter height of cylinder: " );
      
         //convert string to double   
      height = Double.parseDouble(inputString);
      
      
         //calculate volume and surface area
      volume = Math.PI * radius * radius * height;
      surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
            
         //print results
      JOptionPane.showMessageDialog(null, "Volume of Cylinder: " + volume);
      JOptionPane.showMessageDialog(null, "Surface Area of Cylinder: " + surfaceArea);
      
   }//end main
   
}//end class