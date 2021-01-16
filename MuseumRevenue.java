/* 
 * Author: Brian Klein
 * Date: 1/20/17
 * Assignment: MuseumRevenue.java
 * Description: Calculate the revenue for 
 *              each group of museum visitors 
 *              and total museum revenue
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class MuseumRevenue
{
      		
   public static void main(String[] args) 
   {
		
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare constants
      double ticket, gift;
      ticket = 12.99;
      gift = 5.89;
      
         //declare variables
      double childRev, senRev, adultRev, totalRev, childVis, senVis, adultVis, totalVis;
      
         //heading
      System.out.println( "Housing Complex Program" );
      
         //user input
      System.out.println( "Enter number of Children: " );
      childVis = console.nextInt();
      
      System.out.println( "Enter number of Seniors: " );
      senVis = console.nextInt();
      
      System.out.println( "Enter number of Adults: " );
      adultVis = console.nextInt();
      
         //heading
      System.out.println( "The Museum Revenue Information:" );
      
         //calculate total and percentages
      totalVis = childVis + senVis + adultVis;
      childRev = childVis * gift;
      senRev = senVis * (ticket * 0.75 + gift);
      adultRev = adultVis * (ticket + gift);
      totalRev = childRev + senRev + adultRev;
      
         //print results
      System.out.println( "Children Visitors: " + (int)childVis );
      System.out.println( "Senior Visitors: " + (int)senVis );
      System.out.println( "Adult Visitors: " + (int)adultVis );
      
      System.out.println( "Total Number of Visitors: " + (int)totalVis );
      
      System.out.println( "Children Visitor Revenue: $" + childRev );
      System.out.println( "Senior Visitor Revenue: $" + senRev );
      System.out.println( "Adult Visitor Revenue: $" + adultRev );
      
      System.out.println( "Total Revenue: $" + totalRev );
   
   }//end main
   
}//end class