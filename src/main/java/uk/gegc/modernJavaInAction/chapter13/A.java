package uk.gegc.modernJavaInAction.chapter13;

public interface A {
    default void hello(){
        System.out.println("Hello from A");
    }
}
