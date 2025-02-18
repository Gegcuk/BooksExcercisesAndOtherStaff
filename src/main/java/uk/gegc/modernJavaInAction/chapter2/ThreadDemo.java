package uk.gegc.modernJavaInAction.chapter2;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        });
        t1.start();

        Thread t2 = new Thread(()-> System.out.println("Lambda"));
        t2.start();
    }

}
