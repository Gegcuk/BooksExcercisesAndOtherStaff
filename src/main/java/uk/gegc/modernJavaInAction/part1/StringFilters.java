package uk.gegc.modernJavaInAction.part1;

import java.util.List;

public class StringFilters {

    public static List<String> filterStrings(List<String> strings, String prefix){
        return strings.stream().filter(s -> s.startsWith(prefix)).toList();
    }

    public static void main(String[] args) {
        List<String> data = List.of("apple", "art", "banana", "application");
        List<String> filteredList = filterStrings(data, "ap");
        System.out.println(filteredList);
    }

}
