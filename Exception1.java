
import java.util.*;

public class Exception1
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int dividend, divisor, quotient, remainder;           

        try{
           System.out.print("Enter the dividend: ");            
           dividend = console.nextInt();              
                            

           System.out.print("Enter the divisor: ");             
           divisor = console.nextInt();               
                         

           quotient = dividend / divisor; 
		     remainder = dividend % divisor;   
           
           System.out.println("\nQuotient = " + quotient); 
		     System.out.println("Remainder = " + remainder);          
        }
        catch(InputMismatchException e){
           System.out.println( e.toString() );
           System.out.println("Don't be a dummy.");
        }
        catch(ArithmeticException e){
           System.out.println( e.toString() );
           System.out.println("Don't be a dummy.");
        }
        catch(Exception e) {
           System.out.println( e.toString() );
           System.out.println("Don't be a dummy.");
        }
        finally{
           System.out.println("Thank you for using this program.");
        }
           
    }
    
}

