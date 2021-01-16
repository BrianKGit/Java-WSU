
import java.util.*;

public class QuadraticEquation
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
       
       int a, b, c;
       double discriminant;
       
       try {
          System.out.print("Enter a: ");
          a = console.nextInt();
          
          if( a == 0 )
             throw new ArithmeticException("a cannot be zero.");
          
          System.out.print("Enter b: ");
          b = console.nextInt();
          
          System.out.print("Enter c: ");
          c = console.nextInt();
          
          discriminant = getDiscriminant(a, b, c);
          
          calculateRoot(a, b, c, discriminant); //may generate exception
       }
       catch(InputMismatchException e){
       
          System.out.println(e);
          System.out.println("...Don't be a dummy, Dummy!");
          
       }
       catch(ArithmeticException e){
       
          System.out.println(e);
          System.out.println("...Don't be a dummy, Dummy!");
       
       }
       catch(Exception e){
       
          System.out.println(e);
          
          System.out.println("The equation has complex roots.");
       
       }
       
    }//end main
    
    public static double getDiscriminant( int a, int b, int c) {
    
       return b*b - 4*a*c;
    
    }
    
    public static void calculateRoot( int a, int b, int c, double discriminant)throws Exception {
    
       double root1, root2, temp;
       
       if(discriminant == 0) {
       
          root1 = root2 = -b/(2*a);
          
          System.out.println("One single root: " + root1);
       
       }
       else if(discriminant < 0){
       
          throw new Exception("Discriminant is less than 0.");
       
       }
       else {
       
       temp = Math.sqrt(discriminant);
       
       root1 = (-b + temp) / (2*a);
       root2 = (-b - temp) / (2*a);
       
       System.out.println("The equation has two roots: " + root1 + " and " + root2);
       
       }
    
    }
    
}//end class

