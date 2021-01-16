/* 
 * Author: Brian Klein
 * Date: 4-1-17
 * Program: Product.java
 * Purpose: user-defined class to create a product object
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Product
{  
      //declare variables
   double beforeTax, afterTax;

      //data members - instance variables
   private double unitPrice;
   private int numToPurchase;
   private String productName;
   private final double TAX = 0.0675;

      //setters and getters
   public void setPrice(double price) {
      if(price < 0) {
         System.out.println("Invalid, price cannot be less than $0.00.");
      }
      else {
         unitPrice = price;
      }
   }
      
   public void setQuantity(int quantity) {
      if(quantity < 0) {
         System.out.println("Invalid, quantity cannot be less than 0.");
      }
      else {
         numToPurchase = quantity;
      }
   }
   
   public void setName(String name) {
      productName = name;
   }
   
   public double getPrice() {
      return unitPrice;
   }
   
   public int getQuantity() {
      return numToPurchase;
   }
   
   public String getName() {
      return productName;
   }
   
      //price before tax
   public double priceBeforeTax() {
      beforeTax = unitPrice * numToPurchase;
      return beforeTax;
   }
   
      //price after tax
   public double priceAfterTax() {
      afterTax = beforeTax * (1 + TAX);
      return afterTax;
   }
   
      //two overloaded constructors
   public Product() {
      unitPrice = 0.0;
      numToPurchase = 0;
      productName = "N/A";
   }
   
   public Product(double price, int quantity, String name) {
      unitPrice = price;
      numToPurchase = quantity;
      productName = name;
   }
   
      //toString method
   public String toString() {
      String str = "\nProduct: " + productName +
                   "\nQuantity: " + numToPurchase +
                   "\nPrice per unit: $" + unitPrice;
                   
      return str;
   }
   
}//end class