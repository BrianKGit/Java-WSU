/* 
 * Author: Brian Klein
 * Date: 3-22-17
 * Program: FitnessClub.java
 * Purpose: This is a client program
 *          
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class FitnessClub 
{  
   
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
   
      int id, points;
      String name;
      
      MembershipCard card1 = new MembershipCard();
   
      int userInput;
      
      boolean flag = true;
   
      while( flag )
      {
         System.out.println("\n1 - Issue a membership card");
         System.out.println("2 - Print card information");
         System.out.println("3 - Enter the club");
         System.out.println("4 - Purchase more points");
         System.out.println("0 - Exit");
      
         System.out.print("\nEnter the selection: ");
         userInput = console.nextInt();
      
         switch(userInput) {
            case 1:
            
               //get user input
               System.out.print("Enter ID: ");
               id = console.nextInt();
               
               console.nextLine(); //clear the buffer
            
               System.out.print("Enter name: ");
               name = console.nextLine();
            
               System.out.print("Enter points to purchase: ");
               points = console.nextInt();
               
                  //using the class name to retrieve the public static constant
               System.out.println("Thank you for joining our club, you have received free points: " + 
                                  MembershipCard.FREE_POINTS );
            
                  //create a MembershipCard object by invoking constructor
               card1 = new MembershipCard( id, name, points);
            
               break;
         
            case 2:
            
               //print the card information
               System.out.print( card1.toString() );
            
               break;
         
            case 3:
               
               if( card1.getNumberOfPoint() > 0 ) {
                     //enter the club - take one point from card
                  card1.enterClub();
                  System.out.println("Welcome and enjoy your workout.");
               }
               else {
                  System.out.println("You do not have any points left.");
               }
            
               break;
         
            case 4:
            
               //purchase more points
               System.out.print("How many more points to purchase? ");
               points = console.nextInt();
            
               //change card1 object
               card1.purchasePoints( points );
            
               break;
         
            case 0:
               
                  //exit while loop
               flag = false;
            
               break;
         
            default:
               
                  //error message
               System.out.println("Invalid selection, try again.");
         
         
         }//end switch
         
      }//end while
   
   }//end main
   
}//end class