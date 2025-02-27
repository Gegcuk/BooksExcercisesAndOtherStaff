package uk.gegc.modernJavaInAction.chapter7;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class StringLengthTask extends RecursiveTask<Long> {

    private static final int THRESHOLD = 1000;
    private final List<String> data;
    private final int start, end;

    public StringLengthTask(List<String> data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end-start;
        if(length < THRESHOLD) {
            long sum = 0;
            for(int i = start; i < end; i++){
                sum += getLength(data.get(i));
            }
            return sum;
        } else {
            int mid = (start + end) >>> 1;
            StringLengthTask left = new StringLengthTask(data, start, mid);
            StringLengthTask right = new StringLengthTask(data, mid + 1, end);
            left.fork();
            long rightSum = right.compute();
            long leftSum = left.join();
            return leftSum + rightSum;
        }
    }

    private long getLength(String s) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        return s.length();
    }
}
