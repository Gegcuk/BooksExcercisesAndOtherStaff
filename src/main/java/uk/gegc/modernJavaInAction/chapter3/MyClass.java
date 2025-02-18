package uk.gegc.modernJavaInAction.chapter3;

public class MyClass {

    private String text;
    private int number;
    private double factor;

    public MyClass(String s, int x, double d){
        this.text = s;
        this.number = x;
        this.factor = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "text='" + text + '\'' +
                ", number=" + number +
                ", factor=" + factor +
                '}';
    }
}
