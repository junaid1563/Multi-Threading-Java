package DSA.DSAQuestions.multithreading;

public class MyThread extends Thread {
    private Counter counter;

    public MyThread(String name) {
        super(name);
    }

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

//        try {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Thread = " + currentThread().getName() + ", priority = " + currentThread().getPriority() + ", num = " + i);
////                Thread.sleep(1000);
//                Thread.yield();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("RUNNING");
        for (int i = 0; i < 1000; i++) {
            this.counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);
        thread1.start();
        thread2.start();
//        System.out.println("Went to sleep");
//        thread1.setPriority(10);
//        System.out.println("Thread = " + currentThread().getName() + ", priority = " + currentThread().getPriority());
//        thread.interrupt();
        thread1.join();
        thread2.join();
        System.out.println("Came back");
        System.out.println("Count = " + counter.getCount());
    }
}
