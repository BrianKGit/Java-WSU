public class InvalidSecondException extends Exception {

    private String message;
    
       //constructor
    public InvalidSecondException() {
        this("Seconds must be between 0 and 59.");
    }
    
    public InvalidSecondException( String m ) {
        this.message = m;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String toString() {
        return message;
    }

}//end class
