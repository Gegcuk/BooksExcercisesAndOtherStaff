package uk.gegc.modernJavaInAction.chapter3;

public class TriFunctionConstructorRef {

    public static void main(String[] args) {
        TriFunction<String, Integer, Double, MyClass> constructorRed = MyClass::new;

        MyClass obj = constructorRed.apply("Example", 12, 3.14);
        System.out.println(obj);
    }

}
