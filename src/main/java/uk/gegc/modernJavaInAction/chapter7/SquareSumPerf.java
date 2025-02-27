package uk.gegc.modernJavaInAction.chapter7;

import java.util.stream.LongStream;

public class SquareSumPerf {

    static long iterativeSquareSum(long n){
        long res = 0L;
        for(int i = 0; i < n; i++){
            res+= (long) i *i;
        }
        return res;
    }

    static long sequentialSquareSum(long n){
        return LongStream.range(0, n)
                .map(i -> i*i)
                .reduce(0, Long::sum);
    }

    static long parallelSquareSum(long n){
        return LongStream.range(0, n)
                .map(i -> i*i)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        final long n = 1_000_000_000L;
        long start = System.currentTimeMillis();
        long r1 = iterativeSquareSum(n);
        long end = System.currentTimeMillis();
        System.out.printf("Iterative finished in %dms with result = %d.\n", end-start, r1);

        start = System.currentTimeMillis();
        long r2 = sequentialSquareSum(n);
        end = System.currentTimeMillis();
        System.out.printf("Sequential finished in %dms with result = %d.\n", end-start, r2);

        start = System.currentTimeMillis();
        long r3 = parallelSquareSum(n);
        end = System.currentTimeMillis();
        System.out.printf("Parallel finished in %dms with result = %d.\n", end-start, r3);
    }

}
