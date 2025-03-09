package uk.gegc.modernJavaInAction.chapter15;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncSumExample {

    static int f(int x){
        try {Thread.sleep(2000);} catch (InterruptedException e){};
        System.out.println("Job f is done");
        return x + 10;
    }

    static int g(int x){
        try {Thread.sleep(2000);} catch (InterruptedException e){};
        System.out.println("Job g is done");
        return x * 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start = System.currentTimeMillis();
        int x = 10;

        CompletableFuture<Integer> futureF = CompletableFuture.supplyAsync(() -> f(x));
        CompletableFuture<Integer> futureG = CompletableFuture.supplyAsync(() -> g(x));

        CompletableFuture<Integer> result = futureF.thenCombine(futureG, Integer::sum);

        int sum = result.get();
        long end = System.currentTimeMillis();

        System.out.println(sum);
        System.out.println("Time consumed: " + (end-start));

    }

}
