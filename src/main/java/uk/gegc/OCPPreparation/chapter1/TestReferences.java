package uk.gegc.OCPPreparation.chapter1;

public class TestReferences {

    public static void main(String[] args) {
        String one, two;
        one = "a";
        two = "b";
        one = two;
        String three = one;
        one = null;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
