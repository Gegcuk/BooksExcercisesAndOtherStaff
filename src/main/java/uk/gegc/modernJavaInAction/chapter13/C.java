package uk.gegc.modernJavaInAction.chapter13;

public interface C extends A, B{
    default void hello(){
        B.super.hello();
    }
}
