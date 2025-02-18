package uk.gegc.modernJavaInAction.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterAndMapDemo {

    public static <R> List<R> filterAndMap(
            List<String> list,
            Predicate<String> filter,
            Function<String, R> mapping) {
        return list.stream().filter(filter).map(mapping).toList();
    }

    public static void main(String[] args) {
        List<String> data = Arrays.asList("Apple", "Alien", "Box", "Angles", "Cat");
        System.out.println(filterAndMap(data, s->s.startsWith("B"), (String::length)));
    }

}


