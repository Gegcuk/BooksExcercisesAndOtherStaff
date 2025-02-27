package uk.gegc.modernJavaInAction.chapter7;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.ForkJoinPool;
//
//public class TestStringLength {
//
//    public static void main(String[] args) {
//        List<String> data = new ArrayList<>();
//        for (int i = 0; i < 1_000; i++){
//            data.add("Hello " + i);
//        }
//
//        long start = System.currentTimeMillis();
//        long sumSeq = 0;
//        for(String s : data) {
//            sumSeq += s.length();
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {}
//        }
//        long seqTime = System.currentTimeMillis() - start;
//        System.out.printf("Squential sum finished in %dms with result = %d.\n", seqTime, sumSeq);
//
//        start = System.currentTimeMillis();
//        StringLengthTask stringLengthTask = new StringLengthTask(data, 0, data.size());
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        long sumPar = forkJoinPool.invoke(stringLengthTask);
//        long parallelTime = System.currentTimeMillis() - start;
//        System.out.printf("Parallel sum finished in %dms with result = %d.\n", parallelTime, sumPar);
//    }
//}

import java.util.*;
import java.util.concurrent.ForkJoinPool;
public class TestStringLength {
    public static void main(String[] args) {
        // Генерируем 10_000 строк
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            data.add("Hello " + i);
        }
        // Последовательный подсчет
        long start = System.currentTimeMillis();
        long sumSeq = 0;
        for (String s : data) {
            sumSeq += s.length();
            // emulate
            try { Thread.sleep(1); } catch (InterruptedException e) {}
        }
        long seqTime = System.currentTimeMillis() - start;
        System.out.println("Sequential sum = " + sumSeq + ", time = " + seqTime + "ms");
        // Параллельный
        start = System.currentTimeMillis();
        StringLengthTask task = new StringLengthTask(data, 0, data.size());
        ForkJoinPool pool = new ForkJoinPool();
        long sumPar = pool.invoke(task);
        long parTime = System.currentTimeMillis() - start;
        System.out.println("Parallel sum = " + sumPar + ", time = " + parTime + "ms");
    }
}

