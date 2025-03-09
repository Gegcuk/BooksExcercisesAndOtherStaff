package uk.gegc.modernJavaInAction.chapter15;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowExample {

    public static void main(String[] args) throws InterruptedException {

        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();

        MySubscriber subscriber = new MySubscriber();

        publisher.subscribe(subscriber);

        List<Integer> items = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        items.forEach(publisher::submit);

        publisher.close();

        Thread.sleep(1000);




    }

    static class MySubscriber implements Flow.Subscriber<Integer> {

        private Flow.Subscription subscription;
        private int bufferSize = 2;

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            System.out.println("Subscribed");
            subscription.request(bufferSize);
        }

        @Override
        public void onNext(Integer item) {
            System.out.println("Got item: " + item + " -> *2=" + (item*2));
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println("Error: " + throwable.getMessage());
        }

        @Override
        public void onComplete() {
            System.out.println("Done");
        }
    }

}
