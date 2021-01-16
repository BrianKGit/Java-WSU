import java.util.Scanner;

public class FlowerClient {
   
   static final int SIZE = 5;
   static Scanner console = new Scanner(System.in);
   
   public static void main(String [] args) {
      
         //create an array of Flower
      Flower [] list = new Flower[SIZE];
            
         //get user input to populate the array
      for(int i=0; i<SIZE; i++) {
         System.out.println("\nEnter the information for Flower " + (i+1) );
         
         System.out.print("Enter name: ");
         String name = console.next();
         System.out.print("Enter petals: ");
         int petals = console.nextInt();
         System.out.print("Enter cost: ");
         double cost = console.nextDouble();
         
             //create an object and place it into the array
         list[i] = new Flower(name, petals, cost); 
      }
      
         //output the array 
      for (int i = 0; i<SIZE; i++) {
         System.out.println( list[i].toString() );
      }
      
      //create a HighLow object
      HighLow<Flower> flowerList = new HighLow<Flower>( list );
      
      //print the highest
      System.out.println("Highest: " + flowerList.getHighest() );
      
      //print the lowest
      System.out.println("Lowest: " + flowerList.getLowest() );
              
   }
}
