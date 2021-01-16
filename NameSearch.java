import java.util.*;
import java.io.*;

public class NameSearch
{
   public static void main(String [] args) throws IOException
   {
      Scanner console = new Scanner(System.in);
   	
         //create 2 ArrayList objects
      ArrayList<String> boyNameList = new ArrayList<String>();
      ArrayList<String> girlNameList = new ArrayList<String>();
      
         //get file names from the command line
      if( args.length < 2) {
         System.out.println("Provide two data file names from the command line.");
         System.out.println("Try again.");
         return;
      }
      
      String boyNameFile = args[0];
      String girlNameFile = args[1];
      
         //read data to populate the ArrayList
      readData( boyNameList, boyNameFile );
      readData( girlNameList, girlNameFile );
      
         //search
      System.out.print("Enter a boy's name: ");
      String boyName = console.next();
      
      int foundIndex = search( boyName, boyNameList);
      
      if(foundIndex == -1) {
         System.out.println("Not Found");
      }
      else {
         System.out.println("Found at index " + foundIndex);
      }
       
   }//end main
   
   public static void readData(ArrayList list, String fileName) throws IOException {
   
      Scanner inFile = new Scanner( new File( fileName ));
      
      while( inFile.hasNext() ) {
         list.add(inFile.next());
      }
      
      inFile.close();
   
   }//end readData
   
   public static int search( String name, ArrayList list) {
   
      for(int i=0; i<list.size(); i++) {
      
         if( list.get(i).toString().equalsIgnoreCase(name) ) {
            return i;  //found
         }
      
      }
      
      return -1;
   
   }//end search

}//end class
