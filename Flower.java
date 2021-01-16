//objects of flower class are Comparable objects
public class Flower implements Comparable<Flower>{
    //instance variables
    private String name;
    private int petals;
    private double price;

    public Flower() {
    }

    public Flower(String name, int petals, double price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int compareTo( Flower other ) {
       
       int result;
       
       if(this.getPrice() == other.getPrice() )
          result = 0;
       else if( this.getPrice() < other.getPrice() )
          result = -1;
       else
          result = 1;
       
       return result;
       
    }
    
    @Override
    public String toString() {
        return name + ", " + petals + ", " + price;
    } 
}
