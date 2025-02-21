package uk.gegc.modernJavaInAction.chapter5;

import java.util.stream.IntStream;

public class Task2SumOfEvenSquares {

    public static void main(String[] args) {
        int sumOfEvenSquares = IntStream.rangeClosed(1, 100)
                .filter(n->n%2 ==0)
                .map(n->n*n)
                .sum();

        System.out.println(sumOfEvenSquares);
    }

}
