package uk.gegc.modernJavaInAction.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEmptyLinesClass {

    public static void main(String[] args) {
        List<String> lines = List.of(
                "",
                "Line2",
                "line3",
                "",
                "line4",
                "line5",
                "",
                ""
        );

        List<String> nonEmpty = lines.stream()
                .filter(s -> !s.isEmpty())
                .toList();

        nonEmpty.stream()
                .forEach(System.out::println);
    }

}
