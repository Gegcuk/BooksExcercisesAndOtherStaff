package uk.gegc.modernJavaInAction.chapter3;

@FunctionalInterface
public interface TriFunction <T, U, V, R>{
    public  R apply(T t, U u, V v);
}
