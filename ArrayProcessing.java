import java.util.*;

public class ArrayProcessing
{
   public static void main(String [] args)
   {
      Scanner console = new Scanner(System.in);
   	  
      Random rand = new Random();
   	  
      int [] list = new int[25];
   
      for (int i = 0; i < list.length; i++)
      {
            //list[i] = (int)(Math.random() * 500 +1);
         list[i] = rand.nextInt(500) + 1;    //0 to 499, 1 to 500
      }//end for loop
   	  
      System.out.println("\nAll Elements:");
      printArray( list );
   	  
       //call findIndexOfMax method
      int maxIndex = findIndexOfMax(list);
      
      System.out.println("\nThe largest element " + list[maxIndex] +
                         " is at index " + maxIndex);
      
        //call sequentialSearch method
      System.out.print("Enter a key to search: ");
      int key = console.nextInt();
      
      int foundIndex = sequentialSearch( list, key );
      
      if( foundIndex != -1)
      {
         System.out.println("\nFound it at index: " + foundIndex);
      }
      else
      {
         System.out.println("\nNot found");
      }
      
   }//end main

   public static void printArray(int[] list)
   {
      for (int i = 0; i < list.length; i++)
         System.out.print(list[i] + " ");
   }
   
    //find the index of the largest element
   public static int findIndexOfMax( int [] list )
   {
      int maxIndex = 0;
      
      for( int i=1; i<list.length; i++)
      {
         if( list[i] > list[maxIndex])
         {
            maxIndex = i;
         }//end if
         
      }//end for loop
      
      return maxIndex;
   }//end findIndexOfMax method
   
     //sequential search method
   public static int sequentialSearch( int [] list, int key )
   {
      int foundIndex = -1;
      
      for( int i=0; i<list.length; i++)
      {
         if( list[i] == key )
         {
            foundIndex = i;
            break;
         }//end if
         
      }//end for loop
      
      return foundIndex;
   
   }//end sequentialSearch method
   
   public static int countOdds( int [] list)

}//end class
