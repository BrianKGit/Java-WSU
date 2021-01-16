public class HighLow <T extends Comparable<T>> {

   private T[] list; //objects in the list must be Comparable objects
   
   //constructor
   public HighLow( T[] list ) {
      this.list = list;
   }
   
   public T getHighest() {
      
      T highest = list[0]; //assume the first is the highest
      
      for(int i = 1; i < list.length; i++) {
         if(list[i].compareTo(highest) > 0) {
            highest = list[i];
         }
      }
      
      return highest;
      
   }
   
   public T getLowest() {
      
      T lowest = list[0]; //assume the first is the lowest
      
      for(int i = 1; i < list.length; i++) {
         if(list[i].compareTo(lowest) < 0) {
            lowest = list[i];
         }
      }
      
      return lowest;
      
   }
   
}
