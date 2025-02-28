package uk.gegc.modernJavaInAction.chapter8;

import java.util.List;

public class TestImmutableCollection {

    public static void main(String[] args) {
        List<String> list = List.of("test", "test2");
        list.add("test3");
    }

}
