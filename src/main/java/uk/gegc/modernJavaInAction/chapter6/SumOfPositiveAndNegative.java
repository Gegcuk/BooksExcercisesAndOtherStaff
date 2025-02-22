package uk.gegc.modernJavaInAction.chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class SumOfPositiveAndNegative {

    public static Map<Boolean, Integer> sumPosNeg(List<Integer> numbers){
        return numbers.stream().collect(
                partitioningBy(num -> num >= 0, summingInt(num->num))
        );
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 4, -3, 2, -4, -2, 8);

        Map<Boolean, Integer> resultList = sumPosNeg(numbers);

        System.out.println("Sum pos: " + resultList.get(true));
        System.out.println("Sum neg: " + resultList.get(false));
    }

}
