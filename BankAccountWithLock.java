package DSA.DSAQuestions.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountWithLock {
    private int balance = 1000;

    private final Lock lock = new ReentrantLock();

    public void withdrawl(int amount) throws InterruptedException {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " is withdrawing.");
                        System.out.println("Amount is processing....");
                        Thread.sleep(5000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " amount " + amount + " processed");
                    } catch (Exception e) {
                        System.out.println("In catch block");
                        throw new Exception();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " cannot withdraw because funds are insufficient.");
                }
            } else {

                System.out.println(Thread.currentThread().getName() + " cannot acquire lock, try again in sometime");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }

        if (Thread.currentThread().isInterrupted()) {
            System.out.println("Thread " + Thread.currentThread().getName() + " interrupted");
        }

    }
}
