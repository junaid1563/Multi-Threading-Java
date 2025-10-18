package DSA.DSAQuestions.multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BankAccountWithLock account = new BankAccountWithLock();
        Runnable run = () -> {
            try {
                account.withdrawl(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(run, "t1");
        Thread t2 = new Thread(run, "t2");
        t1.start();
        t2.start();

    }
}
