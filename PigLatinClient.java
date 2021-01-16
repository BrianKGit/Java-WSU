import java.util.*;

public class PigLatinClient
{
   public static void main(String [] args)
   {
      Scanner console = new Scanner(System.in);
      
      System.out.print("Enter a string");
      String input = console.nextLine();
      
      input = input.toUpperCase();
      
      PigLatin p = new PigLatin( input );
      
      System.out.println( p.getConverted() );
   }
}//end class