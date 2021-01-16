/**
   This program demonstrates the HighLow class.
*/

public class HighLowTest
{
   public static void main(String[] args)
   {
      // Create an array of Integer values.
      Integer[] numbers = { new Integer(44),
                            new Integer(77),
                            new Integer(11),
                            new Integer(99),
                            new Integer(55),
                            new Integer(22)
                          };
      
      //create a HighLow object
      HighLow<Integer> list = new HighLow<Integer>(numbers);
      
      System.out.println("Highest: " + list.getHighest() );
      
      System.out.println("Lowest: " + list.getLowest() );
                             
   }
}