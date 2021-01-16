/* 
 * Author: Brian Klein
 * Date: 1/26/17
 * Assignment: RoomPercentages.java
 * Description: Calculate total number of apartments 
 *              and percentage of each type; show in JOptionPane
 */

import javax.swing.JOptionPane;  //import JOptionPane
 
public class RoomPercentages
{
      		
   public static void main(String[] args) 
   {
   	
      
         //declare variables
      double stud, bed1, bed2, total, studper, bed1per, bed2per;
      String inputString;
      
         //get number of studios
      inputString =
         JOptionPane.showInputDialog(null, "Enter number of Studio Apartments: " );
      
         //convert string to double   
      stud = Double.parseDouble(inputString);
      
         //get number of 1 bedrooms
      inputString =
         JOptionPane.showInputDialog(null, "Enter number of One-Bedroom Apartments: " );
      
         //convert string to double   
      bed1 = Double.parseDouble(inputString);
      
         //get number of 2 bedrooms
      inputString =
         JOptionPane.showInputDialog(null, "Enter number of Two-Bedroom Apartments: " );
      
         //convert string to double   
      bed2 = Double.parseDouble(inputString);
      
         //calculate total and percentages
      total = stud + bed1 + bed2;
      studper = stud / total;
      bed1per = bed1 / total;
      bed2per = bed2 / total;
      
         //print results
      JOptionPane.showMessageDialog(null, "Studio: " + (int)stud);
      JOptionPane.showMessageDialog(null, "One-Bedroom: " + (int)bed1 );
      JOptionPane.showMessageDialog(null, "Two-Bedroom: " + (int)bed2 );
      
      JOptionPane.showMessageDialog(null, "Total Number of Apartments: " + (int)total );
      
      JOptionPane.showMessageDialog(null, "Percentage of Studio: " + studper * 100 );
      JOptionPane.showMessageDialog(null, "Percentage of One-Bedroom: " + bed1per * 100 );
      JOptionPane.showMessageDialog(null, "Percentage of Two-Bedroom: " + bed2per * 100 );
   
   }//end main
   
}//end class