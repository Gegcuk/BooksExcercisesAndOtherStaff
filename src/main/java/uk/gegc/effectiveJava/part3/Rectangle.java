package uk.gegc.effectiveJava.part3;


/*Task: Create a Rectangle class with width and height fields that implements Comparable. Define equals and
 hashCode according to the contract, compare first by width, then by height, and provide correct toString.*/

public class Rectangle implements Comparable<Rectangle>{
    private final int width;
    private final int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) o;
        return r.width == this.width && r.height == this.height;
    }

    @Override
    public int hashCode(){
        int result = Integer.hashCode(width);
        result = 31 * result + Integer.hashCode(height);
        return result;
    }

    @Override
    public String toString(){
        return "width: " + width + " height: " + height;
    }

    @Override
    public int compareTo(Rectangle o) {
        int result = Integer.compare(width, o.width);
        if(result == 0) result = Integer.compare(height, o.height);
        return result;
    }
}
