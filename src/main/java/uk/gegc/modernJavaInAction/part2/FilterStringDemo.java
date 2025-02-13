package uk.gegc.modernJavaInAction.part2;

import java.util.List;
import java.util.function.Predicate;

public class FilterStringDemo {

    public static List<String> filterList(List<String> strings, Predicate<String> filter){
        return strings.stream().filter(filter).toList();
    }

    public static void main(String[] args) {
        List<String> data = List.of("apple", "pear", "banana", "java", "c++");

        Predicate<String> filterA = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.contains("a");
            }
        };

        System.out.println(filterList(data, filterA));
        System.out.println(filterList(data, s->s.contains("j")));
        System.out.println(filterList(data, s->s.length()>4));
    }
}
