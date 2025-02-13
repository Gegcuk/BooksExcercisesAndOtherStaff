package uk.gegc.modernJavaInAction.part1;

public interface Printable {
    public void print();
    default public void print10times(){
        for(int i = 0; i < 10; i++){
            print();
        }
    }
}
