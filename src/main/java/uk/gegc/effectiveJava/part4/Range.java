package uk.gegc.effectiveJava.part4;

/*Task: Create an immutable Range class that represents a range from the integer start to end inclusive. The class should be:
o Immutable
o Have accessor methods
o Provide a toString method
o Disallow inheritance (e.g., declare final)
Then give an example of use: creating an instance and printing its string representation.*/

public final class Range {

    private final int start;
    private final int end;

    public Range(int start, int end){
        if(start > end) throw new IllegalArgumentException();
        this.start = start;
        this.end = end;
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

    @Override
    public String toString(){
        return "Start: " + start + ", end: " + end;
    }

}
