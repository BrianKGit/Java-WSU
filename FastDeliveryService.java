/* Author: Brian Klein
 * Date: 4-3-17
 * Program: FastDeliveryService.java
 * Purpose: This is a client program for Package
 */


import java.util.Scanner;

public class FastDeliveryService
{
   public static void main( String [] args)
   {
      Scanner console = new Scanner(System.in);
   
         //set the flat fee to $2.5
         //use the class name to call the static method
      PackageDelivery.setFlatFee( 2.5 );  
       
        //create two package objects
      PackageDelivery p1, p2;
       
      p1 = new PackageDelivery( 12345, 45, 0.2 );
       
      p2 = new PackageDelivery( 23199, 89.5, 0.13 );
       
          //print the package information
      System.out.println( p1 );
      System.out.printf("Delivery Cost: $%.2f", p1.calculateCost() );
      
      System.out.println("\n");
       
      System.out.println( p2 );
      System.out.printf("Delivery Cost: $%.2f", p2.calculateCost() );
      
         //comparing p1's weight and p2's weight
      if( p1.getWeight() < p2.getWeight() ) {
         System.out.println("\\nnp1 is lighter than p2.");
      }   
      else {
         System.out.println("\n\np2 is heavier than p1.");
      }      
      
         //comparing p1's delivery cost and p2's delivery cost
      if(p1.calculateCost() < p2.calculateCost() ) {
         System.out.println("\n\np1's delivery cost is less than p2's.");
      }
      else {
         System.out.println("\n\np2's delivery cost is less than p1's.");
      }
      
         //change p1's weight to 55
      p1.setWeight( 55 );           //referencing setter in class program, if want to change cost
                                    //must set a setter for cost
         
         
         
            
   
   
   
   } //end main    

} //end class