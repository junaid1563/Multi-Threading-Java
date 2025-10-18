package DSA.DSAQuestions.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterantExample {
    private ReentrantLock lock = new ReentrantLock();

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method");
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer method");
            innerMethod();
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReenterantExample reenterantExample = new ReenterantExample();
        reenterantExample.outerMethod();
    }
}
