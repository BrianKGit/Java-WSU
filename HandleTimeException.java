
import java.util.*;

public class HandleTimeException
{
   static Scanner console = new Scanner(System.in);

   public static void main(String[] args)
   {
      int hours, minutes, seconds;
      
      String s1;
      
         //call user-defined method to read hours
      hours = readHours();
      
         //call user-defined method to read minutes
      minutes = readMinutes();
         
         //call user-defined method to read seconds
      seconds = readSeconds();
      
      System.out.println("\n" + hours + ":" + minutes + ":" + seconds);
      
   } //end main
   
   public static int readHours() {
   
       int hr = 0;
       boolean flag = false;
       
       do {
           try {
               System.out.print("Enter hours (1 - 12): ");
               hr = console.nextInt();
               
               if(hr <1 || hr >12)
                   throw new InvalidHourException();
              
               flag = true;
           }
           catch(InputMismatchException e) {
               System.out.println( e.toString() );
               console.next();
           }
           catch(InvalidHourException e) {
               System.out.println( e.toString() );
           }
       }
       while( !flag );
       
       return hr;
   
   } 
   
   public static int readMinutes() {
   
       int min = 0;
       boolean flag = false;
       
       do {
           try {
               System.out.print("Enter minutes (0 - 59): ");
               min = console.nextInt();
               
               if(min <0 || min >59)
                   throw new InvalidMinuteException();
              
               flag = true;
           }
           catch(InputMismatchException e) {
               System.out.println( e.toString() );
               console.next();
           }
           catch(InvalidMinuteException e) {
               System.out.println( e.toString() );
           }
       }
       while( !flag );
       
       return min;
   
   }
   
   public static int readSeconds() {
   
       int sec = 0;
       boolean flag = false;
       
       do {
           try {
               System.out.print("Enter seconds (0 - 59): ");
               sec = console.nextInt();
               
               if(sec <0 || sec >59)
                   throw new InvalidSecondException();
              
               flag = true;
           }
           catch(InputMismatchException e) {
               System.out.println( e.toString() );
               console.next();
           }
           catch(InvalidSecondException e) {
               System.out.println( e.toString() );
           }
       }
       while( !flag );
       
       return sec;
   
   }

}//end class

