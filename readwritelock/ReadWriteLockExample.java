package DSA.DSAQuestions.multithreading.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock readLock = readWriteLock.readLock();
    private final Lock writeLock = readWriteLock.writeLock();
    private int count = 0;

    public void increment() {
        writeLock.lock();
        try {
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockExample readWriteLockExample = new ReadWriteLockExample();

        Runnable readTask = () -> {
            System.out.println("Read Task");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " count = " + readWriteLockExample.getCount());
            }
        };

        Runnable writeTask = () -> {
            System.out.println("Write Task");
            for (int i = 0; i < 10; i++) {
                readWriteLockExample.increment();
                System.out.println("Writing for " + Thread.currentThread().getName());
            }
        };

        Thread writeTread = new Thread(writeTask, "writeThread");
        Thread readTread1 = new Thread(readTask, "readThread1");
        Thread readTread2 = new Thread(readTask, "readThread2");

        writeTread.start();
        readTread1.start();
        readTread2.start();

        writeTread.join();
        readTread1.join();
        readTread2.join();

    }

}
