/* Author: Brian Klein
 * Date: 4-3-17
 * Program: PackageDelivery.java
 * Purpose: This is a user-defined class
 */

public class PackageDelivery
{
    //data members - Instance variables
   private int packageID;
   private double weight;
   private double baseCost;
   
      //data member - Static variables 
   private static double flatFee;
   
      //default constructor 
   public PackageDelivery() {
      this( 0, 0.0, 0.0 );
   
   
   }
   
      //overloaded constructor 
   public PackageDelivery(int id, double w, double cost) {
      this.packageID = id;
      this.weight = w;
      this.baseCost = cost;
   }         
    
   //setters and getters
   public void setWeight( double w) {
      weight = w;
   }
   
   public double getWeight() {
      return weight;
   }
   
   
   
   
   
      //static method
   public static void setFlatFee( double fee) {
      flatFee = fee;
   }
 
   public static double getFlatFee() {
      return flatFee;
   }           
        
   public double calculateCost() {
      return this.weight * this.baseCost + this.flatFee;
   }     
   
      //override toString method
   public String toString() {
      return "\nPackage ID: " + packageID +
              "\nWeight In Ounce: " + weight +
              "\nBase Cost: $" + baseCost;
   }               
   
   
   
   
   
   
        

     
} //end class