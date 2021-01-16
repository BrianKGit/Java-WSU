
import java.util.*;

public class YouthLeague
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int age;
        
        while ( true ) {
           
           System.out.print("\nEnter an age (between 12 and 18): ");
           
           try {
              age = console.nextInt();
              
              if(age<=0)
                 throw new Exception("1");
              else if(age < 12)
                 throw new Exception("2");
              else if(age > 18)
                 throw new Exception("3");
              
              break;
           }
           catch(InputMismatchException e) {
              
              console.next();
              
              System.out.print("Invalid input...try not to be a dummy.");
           }
           catch(Exception e){
           
              //System.out.println( e.toString() );
              
              char errorCode = e.toString().charAt(e.toString().length() - 1);
              
              if(errorCode == '1')
                 System.out.println("Age must be greater than zero.");
              if(errorCode == '2')
                 System.out.println("Too young to join the youth league.");
              if(errorCode == '3')
                 System.out.println("Too old to join the youth league.");
           
           }
           
        }//end while
        
        System.out.println("Welcome to the youth league!");
        
    }
    
}

