package DSA.DSAQuestions.multithreading;

public class BankAccount {
    private int balance = 1000;

    public synchronized void withdrawl(int amount) throws InterruptedException {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing.");
            System.out.println("Amount is processing....");
            Thread.sleep(2000);
            balance -= amount;
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw because funds are insufficient.");
        }
    }
}
