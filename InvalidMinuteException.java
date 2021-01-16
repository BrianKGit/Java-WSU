public class InvalidMinuteException extends Exception {

    private String message;
    
       //constructor
    public InvalidMinuteException() {
        this("Minutes must be between 0 and 59.");
    }
    
    public InvalidMinuteException( String m ) {
        this.message = m;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String toString() {
        return message;
    }

}//end class

