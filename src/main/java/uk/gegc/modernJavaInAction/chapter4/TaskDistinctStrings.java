package uk.gegc.modernJavaInAction.chapter4;

import java.util.Arrays;
import java.util.List;

public class TaskDistinctStrings {
    public static void main(String[] args) {
        String[] titles = {
                "Scala", "Java", "Go", "Python", "Kotlin",
                "Pascal", "C", "C++", "Rust", "Groovy",
                "C", "Pascal"
        };

        List<String> result = Arrays.asList(titles).stream()
                .distinct()
                .filter(s->s.length() > 3)
                .limit(3)
                .toList();

        System.out.println(result);
    }

}
