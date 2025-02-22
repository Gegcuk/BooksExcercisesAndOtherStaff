package uk.gegc.modernJavaInAction.chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsByLengthCategory {

    enum LengthCategory{SHORT, MEDIUM, LONG}

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Go", "CSS", "JavaScript", "SQL", "Kotlin", "Elm", "Erlang"
        );

        Map<LengthCategory, List<String>> wordsByLength = words.stream()
                .collect(Collectors.groupingBy(word -> {
                    if (word.length() <= 3) return LengthCategory.SHORT;
                    else if(word.length() <= 7) return LengthCategory.MEDIUM;
                    else return LengthCategory.LONG;
                }));

        System.out.println(wordsByLength);
    }

}
