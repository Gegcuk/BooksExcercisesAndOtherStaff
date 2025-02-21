package uk.gegc.modernJavaInAction.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionTest {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 400),
                new Transaction(2, 1800),
                new Transaction(3, 2000),
                new Transaction(4, 300),
                new Transaction(4, 5460),
                new Transaction(4, 4300),
                new Transaction(4, 3100),
                new Transaction(4, 8300)
        );

        transactions.stream()
                .filter(t -> t.getAmount() > 1900)
                .limit(3)
                .forEach(System.out::println);
    }
}
