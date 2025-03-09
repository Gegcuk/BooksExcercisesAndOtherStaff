package uk.gegc.modernJavaInAction.chapter13;

public interface B {
    default void hello(){
        System.out.println("Hello from B");
    }
}
