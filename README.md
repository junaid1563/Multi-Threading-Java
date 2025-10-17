Tutorial : https://youtu.be/4aYvLz4E1Ts?si=j3yNa1hPhW8-gqit



NOTES https://engineeringdigest.medium.com/multithreading-in-java-39f34724bbf6

=====

CPU



The CPU, often referred to as the brain of the computer, is responsible for executing instructions from programs. It performs basic arithmetic, logic, control, and input/output operations specified by the instructions.



Core



A core is an individual processing unit within a CPU. Modern CPUs can have multiple cores, allowing them to perform multiple tasks simultaneously.



A quad-core processor has four cores, allowing it to perform four tasks simultaneously. For instance, one core could handle your web browser, another your music player, another a download manager, and another a background system update.



Program



A program is a set of instructions written in a programming language that tells the computer how to perform a specific task



Microsoft Word is a program that allows users to create and edit documents.



Process



A process is an instance of a program that is being executed. When a program runs, the operating system creates a process to manage its execution.



When we open Microsoft Word, it becomes a process in the operating system.



Thread



A thread is the smallest unit of execution within a process. A process can have multiple threads, which share the same resources but can run independently.



A web browser like Google Chrome might use multiple threads for different tabs, with each tab running as a separate thread.



Multitasking



Multitasking allows an operating system to run multiple processes simultaneously. On single-core CPUs, this is done through time-sharing, rapidly switching between tasks. On multi-core CPUs, true parallel execution occurs, with tasks distributed across cores. The OS scheduler balances the load, ensuring efficient and responsive system performance.



Example: We are browsing the internet while listening to music and downloading a file.



Multitasking utilizes the capabilities of a CPU and its cores. When an operating system performs multitasking, it can assign different tasks to different cores. This is more efficient than assigning all tasks to a single core.



Multithreading



Multithreading refers to the ability to execute multiple threads within a single process concurrently.



A web browser can use multithreading by having separate threads for rendering the page, running JavaScript, and managing user inputs. This makes the browser more responsive and efficient.



Multithreading enhances the efficiency of multitasking by breaking down individual tasks into smaller sub-tasks or threads. These threads can be processed simultaneously, making better use of the CPU’s capabilities.



In a single-core system:



Both threads and processes are managed by the OS scheduler through time slicing and context switching to create the illusion of simultaneous execution.



In a multi-core system:



Both threads and processes can run in true parallel on different cores, with the OS scheduler distributing tasks across the cores to optimize performance.



Time Slicing



Definition: Time slicing divides CPU time into small intervals called time slices or quanta.

Function: The OS scheduler allocates these time slices to different processes and threads, ensuring each gets a fair share of CPU time.

Purpose: This prevents any single process or thread from monopolizing the CPU, improving responsiveness and enabling concurrent execution.

Context Switching



Definition: Context switching is the process of saving the state of a currently running process or thread and loading the state of the next one to be executed.

Function: When a process or thread’s time slice expires, the OS scheduler performs a context switch to move the CPU’s focus to another process or thread.

Purpose: This allows multiple processes and threads to share the CPU, giving the appearance of simultaneous execution on a single-core CPU or improving parallelism on multi-core CPUs.

Multitasking can be achieved through multithreading where each task is divided into threads that are managed concurrently.



While multitasking typically refers to the running of multiple applications, multithreading is more granular, dealing with multiple threads within the same application or process.



Multithreading in Java

Java provides robust support for multithreading, allowing developers to create applications that can perform multiple tasks simultaneously, improving performance and responsiveness.



In Java, multithreading is the concurrent execution of two or more threads to maximize the utilization of the CPU. Java’s multithreading capabilities are part of the java.lang package, making it easy to implement concurrent execution.



In a single-core environment, Java’s multithreading is managed by the JVM and the OS, which switch between threads to give the illusion of concurrency.



The threads share the single core, and time-slicing is used to manage thread execution.



In a multi-core environment, Java’s multithreading can take full advantage of the available cores.



The JVM can distribute threads across multiple cores, allowing true parallel execution of threads.



A thread is a lightweight process, the smallest unit of processing. Java supports multithreading through its java.lang.Thread class and the java.lang.Runnable interface.



When a Java program starts, one thread begins running immediately, which is called the main thread. This thread is responsible for executing the main method of a program.



public class Test {

&nbsp;   public static void main(String\[] args) {

&nbsp;       System.out.println("Hello world !");

&nbsp;   }

}

To create a new thread in Java, you can either extend the Thread class or implement the Runnable interface.



Method 1: extend the Thread class

A new class World is created that extends Thread.

The run method is overridden to define the code that constitutes the new thread.

start method is called to initiate the new thread.

public class Test {

&nbsp;   public static void main(String\[] args) {

&nbsp;       World world = new World();

&nbsp;       world.start();

&nbsp;       for (; ; ) {

&nbsp;           System.out.println("Hello");

&nbsp;       }

&nbsp;   }

}

public class World extends Thread {

&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       for (; ; ) {

&nbsp;           System.out.println("World");

&nbsp;       }

&nbsp;   }

}

Method 2: Implement Runnable interface

A new class World is created that implements Runnable.

The run method is overridden to define the code that constitutes the new thread.

A Thread object is created by passing an instance of World.

start method is called on the Thread object to initiate the new thread.

public class Test {

&nbsp;   public static void main(String\[] args) {

&nbsp;       World world = new World();

&nbsp;       Thread thread = new Thread(world);

&nbsp;       thread.start();

&nbsp;       for (; ; ) {

&nbsp;           System.out.println("Hello");

&nbsp;       }

&nbsp;   }

}

public class World implements Runnable {

&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       for (; ; ) {

&nbsp;           System.out.println("World");

&nbsp;       }

&nbsp;   }

}

Thread Lifecycle

The lifecycle of a thread in Java consists of several states, which a thread can move through during its execution.



New: A thread is in this state when it is created but not yet started.

Runnable: After the start method is called, the thread becomes runnable. It’s ready to run and is waiting for CPU time.

Running: The thread is in this state when it is executing.

Blocked/Waiting: A thread is in this state when it is waiting for a resource or for another thread to perform an action.

Terminated: A thread is in this state when it has finished executing.

public class MyThread extends Thread{

&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       System.out.println("RUNNING"); // RUNNING

&nbsp;       try {

&nbsp;           Thread.sleep(2000);

&nbsp;       } catch (InterruptedException e) {

&nbsp;           System.out.println(e);

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) throws InterruptedException {

&nbsp;       MyThread t1 = new MyThread();

&nbsp;       System.out.println(t1.getState()); // NEW

&nbsp;       t1.start();

&nbsp;       System.out.println(t1.getState()); // RUNNABLE

&nbsp;       Thread.sleep(100);

&nbsp;       System.out.println(t1.getState()); // TIMED\_WAITING

&nbsp;       t1.join();

&nbsp;       System.out.println(t1.getState()); // TERMINATED

&nbsp;   }

}

Runnable vs Thread

Use Runnable when you want to separate the task from the thread, allowing the class to extend another class if needed. Extend Thread if you need to override Thread methods or if the task inherently requires direct control over the thread itself, though this limits inheritance.



Thread methods

start( ): Begins the execution of the thread. The Java Virtual Machine (JVM) calls the run() method of the thread.

run( ): The entry point for the thread. When the thread is started, the run() method is invoked. If the thread was created using a class that implements Runnable, the run() method will execute the run() method of that Runnable object.

sleep(long millis): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

join( ): Waits for this thread to die. When one thread calls the join() method of another thread, it pauses the execution of the current thread until the thread being joined has completed its execution.

setPriority(int newPriority): Changes the priority of the thread. The priority is a value between Thread.MIN\_PRIORITY (1) and Thread.MAX\_PRIORITY (10).

public class MyThread extends Thread {

&nbsp;   public MyThread(String name) {

&nbsp;       super(name);

&nbsp;   }



&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       System.out.println("Thread is Running...");

&nbsp;       for (int i = 1; i <= 5; i++) {

&nbsp;           for (int j = 0; j < 5; j++) {

&nbsp;               System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);

&nbsp;               try {

&nbsp;                   Thread.sleep(1000);

&nbsp;               } catch (InterruptedException e) {

&nbsp;                   e.printStackTrace();



&nbsp;               }

&nbsp;           }

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) throws InterruptedException {



&nbsp;       MyThread l = new MyThread("Low Priority Thread");

&nbsp;       MyThread m = new MyThread("Medium Priority Thread");

&nbsp;       MyThread n = new MyThread("High Priority Thread");

&nbsp;       l.setPriority(Thread.MIN\_PRIORITY);

&nbsp;       m.setPriority(Thread.NORM\_PRIORITY);

&nbsp;       n.setPriority(Thread.MAX\_PRIORITY);

&nbsp;       l.start();

&nbsp;       m.start();

&nbsp;       n.start();



&nbsp;   }

}

6\. interrupt(): Interrupts the thread. If the thread is blocked in a call to wait(), sleep(), or join(), it will throw an InterruptedException.



7\. yield(): Thread.yield() is a static method that suggests the current thread temporarily pause its execution to allow other threads of the same or higher priority to execute. It’s important to note that yield() is just a hint to the thread scheduler, and the actual behavior may vary depending on the JVM and OS.



public class MyThread extends Thread {

&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       for (int i = 0; i < 5; i++) {

&nbsp;           System.out.println(Thread.currentThread().getName() + " is running...");

&nbsp;           Thread.yield();

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       MyThread t1 = new MyThread(); 

&nbsp;       MyThread t2 = new MyThread();

&nbsp;       t1.start();

&nbsp;       t2.start();

&nbsp;   }

}

8\. Thread.setDaemon(boolean): Marks the thread as either a daemon thread or a user thread. When the JVM exits, all daemon threads are terminated.



public class MyThread extends Thread {

&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       while (true) {

&nbsp;           System.out.println("Hello world! ");

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       MyThread myThread = new MyThread();

&nbsp;       myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now

&nbsp;       MyThread t1 = new MyThread();

&nbsp;       t1.start(); // t1 is user thread

&nbsp;       myThread.start();

&nbsp;       System.out.println("Main Done");

&nbsp;   }

}

Synchronisation

Let’s see an example where two threads are incrementing same couter.



class Counter {

&nbsp;   private int count = 0; // shared resource



&nbsp;   public void increment() {

&nbsp;       count++;

&nbsp;   }



&nbsp;   public int getCount() {

&nbsp;       return count;

&nbsp;   }

}



public class MyThread extends Thread {

&nbsp;   private Counter counter;



&nbsp;   public MyThread(Counter counter) {

&nbsp;       this.counter = counter;

&nbsp;   }



&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       for (int i = 0; i < 1000; i++) {

&nbsp;           counter.increment();

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       Counter counter = new Counter();

&nbsp;       MyThread t1 = new MyThread(counter);

&nbsp;       MyThread t2 = new MyThread(counter);

&nbsp;       t1.start();

&nbsp;       t2.start();

&nbsp;       try {

&nbsp;           t1.join();

&nbsp;           t2.join();

&nbsp;       }catch (Exception e){



&nbsp;       }

&nbsp;       System.out.println(counter.getCount()); // Expected: 2000, Actual will be random <= 2000

&nbsp;   }

}

The output of the code is not 2000 because the increment method in the Counter class is not synchronized. This results in a race condition when both threads try to increment the count variable concurrently.



Without synchronization, one thread might read the value of count before the other thread has finished writing its incremented value. This can lead to both threads reading the same value, incrementing it, and writing it back, effectively losing one of the increments.



We can fix this by using synchronized keyword



class Counter {

&nbsp;   private int count = 0; // shared resource



&nbsp;   public synchronized void increment() {

&nbsp;       count++;

&nbsp;   }



&nbsp;   public int getCount() {

&nbsp;       return count;

&nbsp;   }

}

By synchronizing the increment method, you ensure that only one thread can execute this method at a time, which prevents the race condition. With this change, the output will consistently be 2000.



Locks

The synchronized keyword in Java provides basic thread-safety but has limitations: it locks the entire method or block, leading to potential performance issues. It lacks a try-lock mechanism, causing threads to block indefinitely, increasing the risk of deadlocks. Additionally, synchronized doesn't support multiple condition variables, offering only a single monitor per object with basic wait/notify mechanisms. In contrast, explicit locks (Lock interface) offer finer-grained control, try-lock capabilities to avoid blocking, and more sophisticated thread coordination through multiple condition variables, making them more flexible and powerful for complex concurrency scenarios.



import java.util.concurrent.TimeUnit;

import java.util.concurrent.locks.Lock;

import java.util.concurrent.locks.ReentrantLock;



public class BankAccount {

&nbsp;   private int balance = 100;

&nbsp;   private final Lock lock = new ReentrantLock();



&nbsp;   public void withdraw(int amount) {

&nbsp;       System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

&nbsp;       try {

&nbsp;           if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

&nbsp;               if (balance >= amount) {

&nbsp;                   try {

&nbsp;                       System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");

&nbsp;                       Thread.sleep(3000); // Simulate time taken to process the withdrawal

&nbsp;                       balance -= amount;

&nbsp;                       System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);

&nbsp;                   } catch (Exception e) {

&nbsp;                       Thread.currentThread().interrupt();

&nbsp;                   } finally {

&nbsp;                       lock.unlock();

&nbsp;                   }

&nbsp;               } else {

&nbsp;                   System.out.println(Thread.currentThread().getName() + " insufficient balance");

&nbsp;               }

&nbsp;           } else {

&nbsp;               System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");

&nbsp;           }

&nbsp;       } catch (Exception e) {

&nbsp;           Thread.currentThread().interrupt();

&nbsp;       }

&nbsp;   }

}

public class Main {

&nbsp;   public static void main(String\[] args) {

&nbsp;       BankAccount sbi = new BankAccount();

&nbsp;       Runnable task = new Runnable() {

&nbsp;           @Override

&nbsp;           public void run() {

&nbsp;               sbi.withdraw(50);

&nbsp;           }

&nbsp;       };

&nbsp;       Thread t1 = new Thread(task, "Thread 1");

&nbsp;       Thread t2 = new Thread(task, "Thread 2");

&nbsp;       t1.start();

&nbsp;       t2.start();

&nbsp;   }

}

Reentrant Lock

A Reentrant Lock in Java is a type of lock that allows a thread to acquire the same lock multiple times without causing a deadlock. If a thread already holds the lock, it can re-enter the lock without being blocked. This is useful when a thread needs to repeatedly enter synchronized blocks or methods within the same execution flow. The ReentrantLock class from the java.util.concurrent.locks package provides this functionality, offering more flexibility than the synchronized keyword, including try-locking, timed locking, and multiple condition variables for advanced thread coordination.



public class ReentrantExample {

&nbsp;   private final Lock lock = new ReentrantLock();



&nbsp;   public void outerMethod() {

&nbsp;       lock.lock();

&nbsp;       try {

&nbsp;           System.out.println("Outer method");

&nbsp;           innerMethod();

&nbsp;       } finally {

&nbsp;           lock.unlock();

&nbsp;       }

&nbsp;   }



&nbsp;   public void innerMethod() {

&nbsp;       lock.lock();

&nbsp;       try {

&nbsp;           System.out.println("Inner method");

&nbsp;       } finally {

&nbsp;           lock.unlock();

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       ReentrantExample example = new ReentrantExample();

&nbsp;       example.outerMethod();

&nbsp;   }

}

Methods of ReentrantLock

lock()



Acquires the lock, blocking the current thread until the lock is available. It would block the thread until the lock becomes available, potentially leading to situations where a thread waits indefinitely.

If the lock is already held by another thread, the current thread will wait until it can acquire the lock.

tryLock()



Tries to acquire the lock without waiting. Returns true if the lock was acquired, false otherwise.

This is non-blocking, meaning the thread will not wait if the lock is not available.

tryLock(long timeout, TimeUnit unit)



Attempts to acquire the lock, but with a timeout. If the lock is not available, the thread waits for the specified time before giving up. It is used when you want to attempt to acquire the lock without waiting indefinitely. It allows the thread to proceed with other work if the lock isn't available within the specified time. This approach is useful to avoid deadlock scenarios and when you don't want a thread to block forever waiting for a lock.

Returns true if the lock was acquired within the timeout, false otherwise.

unlock()



Releases the lock held by the current thread.

Must be called in a finally block to ensure that the lock is always released even if an exception occurs.

lockInterruptibly()



Acquires the lock unless the current thread is interrupted. This is useful when you want to handle interruptions while acquiring a lock.

Read Write Lock

A Read-Write Lock is a concurrency control mechanism that allows multiple threads to read shared data simultaneously while restricting write access to a single thread at a time. This lock type, provided by the ReentrantReadWriteLock class in Java, optimizes performance in scenarios with frequent read operations and infrequent writes. Multiple readers can acquire the read lock without blocking each other, but when a thread needs to write, it must acquire the write lock, ensuring exclusive access. This prevents data inconsistency while improving read efficiency compared to traditional locks, which block all access during write operations.



import java.util.concurrent.locks.Lock;

import java.util.concurrent.locks.ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;



public class ReadWriteCounter {

&nbsp;   private int count = 0;

&nbsp;   private final ReadWriteLock lock = new ReentrantReadWriteLock();

&nbsp;   private final Lock readLock = lock.readLock();

&nbsp;   private final Lock writeLock = lock.writeLock();



&nbsp;   public void increment() {

&nbsp;       writeLock.lock();

&nbsp;       try {

&nbsp;           count++;

&nbsp;           Thread.sleep(50);

&nbsp;       } catch (InterruptedException e) {

&nbsp;           throw new RuntimeException(e);

&nbsp;       } finally {

&nbsp;           writeLock.unlock();

&nbsp;       }

&nbsp;   }



&nbsp;   public int getCount() {

&nbsp;       readLock.lock();

&nbsp;       try {

&nbsp;           return count;

&nbsp;       } finally {

&nbsp;           readLock.unlock();

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) throws InterruptedException {

&nbsp;       ReadWriteCounter counter = new ReadWriteCounter();



&nbsp;       Runnable readTask = new Runnable() {

&nbsp;           @Override

&nbsp;           public void run() {

&nbsp;               for (int i = 0; i < 10; i++) {

&nbsp;                   System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());

&nbsp;               }

&nbsp;           }

&nbsp;       };



&nbsp;       Runnable writeTask = new Runnable() {

&nbsp;           @Override

&nbsp;           public void run() {

&nbsp;               for (int i = 0; i < 10; i++) {

&nbsp;                   counter.increment();

&nbsp;                   System.out.println(Thread.currentThread().getName() + " incremented");

&nbsp;               }

&nbsp;           }

&nbsp;       };



&nbsp;       Thread writerThread = new Thread(writeTask);

&nbsp;       Thread readerThread1 = new Thread(readTask);

&nbsp;       Thread readerThread2 = new Thread(readTask);



&nbsp;       writerThread.start();

&nbsp;       readerThread1.start();

&nbsp;       readerThread2.start();



&nbsp;       writerThread.join();

&nbsp;       readerThread1.join();

&nbsp;       readerThread2.join();



&nbsp;       System.out.println("Final count: " + counter.getCount());

&nbsp;   }

}

Fairness of Locks

Fairness in the context of locks refers to the order in which threads acquire a lock. A fair lock ensures that threads acquire the lock in the order they requested it, preventing thread starvation. With a fair lock, if multiple threads are waiting, the longest-waiting thread is granted the lock next. However, fairness can lead to lower throughput due to the overhead of maintaining the order. Non-fair locks, in contrast, allow threads to “cut in line,” potentially offering better performance but at the risk of some threads waiting indefinitely if others frequently acquire the lock.



import java.util.concurrent.locks.Lock;

import java.util.concurrent.locks.ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;



public class FairnessLockExample {

&nbsp;   private final Lock lock = new ReentrantLock(true);



&nbsp;   public void accessResource() {

&nbsp;       lock.lock();

&nbsp;       try {

&nbsp;           System.out.println(Thread.currentThread().getName() + " acquired the lock.");

&nbsp;           Thread.sleep(1000);

&nbsp;       } catch (InterruptedException e) {

&nbsp;           Thread.currentThread().interrupt();

&nbsp;       } finally {

&nbsp;           System.out.println(Thread.currentThread().getName() + " released the lock.");

&nbsp;           lock.unlock();

&nbsp;       }

&nbsp;   }



&nbsp;   public static void main(String\[] args) {

&nbsp;       FairnessLockExample example = new FairnessLockExample();



&nbsp;       Runnable task = new Runnable() {

&nbsp;           @Override

&nbsp;           public void run() {

&nbsp;               example.accessResource();

&nbsp;           }

&nbsp;       };



&nbsp;       Thread thread1 = new Thread(task, "Thread 1");

&nbsp;       Thread thread2 = new Thread(task, "Thread 2");

&nbsp;       Thread thread3 = new Thread(task, "Thread 3");



&nbsp;       thread1.start();

&nbsp;       thread2.start();

&nbsp;       thread3.start();

&nbsp;   }

}

Deadlock

A deadlock occurs in concurrent programming when two or more threads are blocked forever, each waiting for the other to release a resource. This typically happens when threads hold locks on resources and request additional locks held by other threads. For example, Thread A holds Lock 1 and waits for Lock 2, while Thread B holds Lock 2 and waits for Lock 1. Since neither thread can proceed, they remain stuck in a deadlock state. Deadlocks can severely impact system performance and are challenging to debug and resolve in multi-threaded applications.



class Pen {

&nbsp;   public synchronized void writeWithPenAndPaper(Paper paper) {

&nbsp;       System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper " + paper);

&nbsp;       paper.finishWriting();

&nbsp;   }



&nbsp;   public synchronized void finishWriting() {

&nbsp;       System.out.println(Thread.currentThread().getName() + " finished using pen " + this);

&nbsp;   }

}



class Paper {

&nbsp;   public synchronized void writeWithPaperAndPen(Pen pen) {

&nbsp;       System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + pen);

&nbsp;       pen.finishWriting();

&nbsp;   }



&nbsp;   public synchronized void finishWriting() {

&nbsp;       System.out.println(Thread.currentThread().getName() + " finished using paper " + this);

&nbsp;   }

}



class Task1 implements Runnable {

&nbsp;   private Pen pen;

&nbsp;   private Paper paper;



&nbsp;   public Task1(Pen pen, Paper paper) {

&nbsp;       this.pen = pen;

&nbsp;       this.paper = paper;

&nbsp;   }



&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper

&nbsp;   }

}



class Task2 implements Runnable {

&nbsp;   private Pen pen;

&nbsp;   private Paper paper;



&nbsp;   public Task2(Pen pen, Paper paper) {

&nbsp;       this.pen = pen;

&nbsp;       this.paper = paper;

&nbsp;   }



&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       synchronized (pen){

&nbsp;           paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen

&nbsp;       }

&nbsp;   }

}





public class DeadlockExample {

&nbsp;   public static void main(String\[] args) {

&nbsp;       Pen pen = new Pen();

&nbsp;       Paper paper = new Paper();



&nbsp;       Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");

&nbsp;       Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");



&nbsp;       thread1.start();

&nbsp;       thread2.start();

&nbsp;   }

}

Thread communication

class SharedResource {

&nbsp;   private int data;

&nbsp;   private boolean hasData;



&nbsp;   public synchronized void produce(int value) {

&nbsp;       while (hasData) {

&nbsp;           try {

&nbsp;               wait();

&nbsp;           } catch (InterruptedException e) {

&nbsp;               Thread.currentThread().interrupt();

&nbsp;           }

&nbsp;       }

&nbsp;       data = value;

&nbsp;       hasData = true;

&nbsp;       System.out.println("Produced: " + value);

&nbsp;       notify();

&nbsp;   }



&nbsp;   public synchronized int consume() {

&nbsp;       while (!hasData){

&nbsp;           try{

&nbsp;               wait();

&nbsp;           }catch (InterruptedException e){

&nbsp;               Thread.currentThread().interrupt();

&nbsp;           }

&nbsp;       }

&nbsp;       hasData = false;

&nbsp;       System.out.println("Consumed: " + data);

&nbsp;       notify();

&nbsp;       return data;

&nbsp;   }

}



class Producer implements Runnable {

&nbsp;   private SharedResource resource;



&nbsp;   public Producer(SharedResource resource) {

&nbsp;       this.resource = resource;

&nbsp;   }



&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       for (int i = 0; i < 10; i++) {

&nbsp;           resource.produce(i);

&nbsp;       }

&nbsp;   }

}



class Consumer implements Runnable {

&nbsp;   private SharedResource resource;



&nbsp;   public Consumer(SharedResource resource) {

&nbsp;       this.resource = resource;

&nbsp;   }



&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       for (int i = 0; i < 10; i++) {

&nbsp;           int value = resource.consume();

&nbsp;       }

&nbsp;   }

}



public class ThreadCommunication {

&nbsp;   public static void main(String\[] args) {

&nbsp;       SharedResource resource = new SharedResource();

&nbsp;       Thread producerThread = new Thread(new Producer(resource));

&nbsp;       Thread consumerThread = new Thread(new Consumer(resource));



&nbsp;       producerThread.start();

&nbsp;       consumerThread.start();

&nbsp;   }

}

Executors framework

The Executors framework was introduced in Java 5 as part of the java.util.concurrent package to simplify the development of concurrent applications by abstracting away many of the complexities involved in creating and managing threads.



It will help in



Avoiding Manual Thread management

Resource management

Scalability

Thread reuse

Error handling



import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import java.util.concurrent.TimeUnit;



public class ExecutorFrameWork {



&nbsp;   public static void main(String\[] args) {

&nbsp;       long startTime = System.currentTimeMillis();

&nbsp;       ExecutorService executor = Executors.newFixedThreadPool(3);

&nbsp;       for (int i = 1; i < 10; i++) {

&nbsp;           int finalI = i;

&nbsp;           executor.submit(() -> {

&nbsp;               long result = factorial(finalI);

&nbsp;               System.out.println(result);

&nbsp;           });



&nbsp;       }

&nbsp;       executor.shutdown();

&nbsp;       // executor.shutdown();

&nbsp;       try {

&nbsp;           executor.awaitTermination(1, TimeUnit.SECONDS);

&nbsp;       } catch (InterruptedException e) {

&nbsp;           throw new RuntimeException(e);

&nbsp;       }



&nbsp;       System.out.println("Total time " + (System.currentTimeMillis() - startTime));

&nbsp;   }



&nbsp;   private static long factorial(int n) {

&nbsp;       try {

&nbsp;           Thread.sleep(1000);

&nbsp;       } catch (InterruptedException e) {

&nbsp;           throw new RuntimeException(e);

&nbsp;       }

&nbsp;       long result = 1;

&nbsp;       for (int i = 1; i <= n; i++) {

&nbsp;           result \*= i;

&nbsp;       }

&nbsp;       return result;

&nbsp;   }

}

Future

import java.util.concurrent.ExecutionException;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import java.util.concurrent.Future;



public class Main {



&nbsp;   public static void main(String\[] args) throws ExecutionException, InterruptedException {

&nbsp;       ExecutorService executorService = Executors.newSingleThreadExecutor();

&nbsp;       Future<?> future = executorService.submit(() -> System.out.println("Hello")); // runnable parameter

&nbsp;       System.out.println(future.get()); // blocking call ( null )

&nbsp;       if(future.isDone()){

&nbsp;           System.out.println("Task is done !");

&nbsp;       }

&nbsp;       executorService.shutdown();

&nbsp;   }

}



Hello

null

Task is done !

import java.util.concurrent.ExecutionException;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import java.util.concurrent.Future;



public class Main {



&nbsp;   public static void main(String\[] args) throws ExecutionException, InterruptedException {

&nbsp;       ExecutorService executorService = Executors.newSingleThreadExecutor();

&nbsp;       Future<String> future = executorService.submit(() -> "Hello"); // callable parameter

&nbsp;       System.out.println(future.get()); // blocking call

&nbsp;       if(future.isDone()){

&nbsp;           System.out.println("Task is done !");

&nbsp;       }

&nbsp;       executorService.shutdown();

&nbsp;   }

}

Hello

Task is done !

Atomic classes

public class VolatileCounter {

&nbsp;   private AtomicInteger counter = new AtomicInteger(0);



&nbsp;   public void increment() {

&nbsp;       counter.incrementAndGet();

&nbsp;   }



&nbsp;   public int getCounter() {

&nbsp;       return counter.get();

&nbsp;   }



&nbsp;   public static void main(String\[] args) throws InterruptedException {

&nbsp;       VolatileCounter vc = new VolatileCounter();

&nbsp;       Thread t1 = new Thread(() -> {

&nbsp;           for (int i = 0; i < 1000; i++) {

&nbsp;               vc.increment();

&nbsp;           }

&nbsp;       });

&nbsp;       Thread t2 = new Thread(() -> {

&nbsp;           for (int i = 0; i < 1000; i++) {

&nbsp;               vc.increment();

&nbsp;           }

&nbsp;       });

&nbsp;       t1.start();

&nbsp;       t2.start();

&nbsp;       t1.join();

&nbsp;       t2.join();

&nbsp;       System.out.println(vc.getCounter());

&nbsp;   }



}

Volatile keyword

class SharedObj {

&nbsp;   private volatile boolean flag = false;



&nbsp;   public void setFlagTrue() {

&nbsp;       System.out.println("Writer thread made the flag true !");

&nbsp;       flag = true;

&nbsp;   }



&nbsp;   public void printIfFlagTrue() {

&nbsp;       while (!flag) {

&nbsp;           // do nothing

&nbsp;       }

&nbsp;       System.out.println("Flag is true !");

&nbsp;   }

}



public class VolatileExample {

&nbsp;   public static void main(String\[] args) {

&nbsp;       SharedObj sharedObj = new SharedObj();



&nbsp;       Thread writerThread = new Thread(() -> {

&nbsp;           try {

&nbsp;               Thread.sleep(1000);

&nbsp;           } catch (InterruptedException e) {

&nbsp;               Thread.currentThread().interrupt();

&nbsp;           }

&nbsp;           sharedObj.setFlagTrue();

&nbsp;       });



&nbsp;       Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());



&nbsp;       writerThread.start();

&nbsp;       readerThread.start();

&nbsp;   }

}

CountDownLatch

import java.util.concurrent.Callable;

import java.util.concurrent.CountDownLatch;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;



public class Test {

&nbsp;   public static void main(String\[] args) throws InterruptedException {

&nbsp;       int n = 3;

&nbsp;       ExecutorService executorService = Executors.newFixedThreadPool(n);

&nbsp;       CountDownLatch latch = new CountDownLatch(n);

&nbsp;       executorService.submit(new DependentService(latch));

&nbsp;       executorService.submit(new DependentService(latch));

&nbsp;       executorService.submit(new DependentService(latch));

&nbsp;       latch.await();

&nbsp;       System.out.println("Main");

&nbsp;       executorService.shutdown();

&nbsp;   }

}



class DependentService implements Callable<String> {

&nbsp;   private final CountDownLatch latch;

&nbsp;   public DependentService(CountDownLatch latch) {

&nbsp;       this.latch = latch;

&nbsp;   }

&nbsp;   @Override

&nbsp;   public String call() throws Exception {

&nbsp;       try {

&nbsp;           System.out.println(Thread.currentThread().getName() + " service started.");

&nbsp;           Thread.sleep(2000);

&nbsp;       } finally {

&nbsp;           latch.countDown();

&nbsp;       }

&nbsp;       return "ok";

&nbsp;   }

}

pool-1-thread-3 service started.

pool-1-thread-2 service started.

pool-1-thread-1 service started.

Main

Cyclic Barrier

import java.util.concurrent.BrokenBarrierException;

import java.util.concurrent.CyclicBarrier;



public class Main {



&nbsp;   public static void main(String\[] args)  {

&nbsp;       int numberOfSubsystems = 4;

&nbsp;       CyclicBarrier barrier = new CyclicBarrier(numberOfSubsystems, new Runnable() {

&nbsp;           @Override

&nbsp;           public void run() {

&nbsp;               System.out.println("All subsystems are up and running. System startup complete.");

&nbsp;           }

&nbsp;       });



&nbsp;       Thread webServerThread = new Thread(new Subsystem("Web Server", 2000, barrier));

&nbsp;       Thread databaseThread = new Thread(new Subsystem("Database", 4000, barrier));

&nbsp;       Thread cacheThread = new Thread(new Subsystem("Cache", 3000, barrier));

&nbsp;       Thread messagingServiceThread = new Thread(new Subsystem("Messaging Service", 3500, barrier));



&nbsp;       webServerThread.start();

&nbsp;       databaseThread.start();

&nbsp;       cacheThread.start();

&nbsp;       messagingServiceThread.start();



&nbsp;   }





}



class Subsystem implements Runnable {

&nbsp;   private String name;

&nbsp;   private int initializationTime;

&nbsp;   private CyclicBarrier barrier;



&nbsp;   public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {

&nbsp;       this.name = name;

&nbsp;       this.initializationTime = initializationTime;

&nbsp;       this.barrier = barrier;

&nbsp;   }



&nbsp;   @Override

&nbsp;   public void run() {

&nbsp;       try {

&nbsp;           System.out.println(name + " initialization started.");

&nbsp;           Thread.sleep(initializationTime); // Simulate time taken to initialize

&nbsp;           System.out.println(name + " initialization complete.");

&nbsp;           barrier.await();

&nbsp;       } catch (InterruptedException | BrokenBarrierException e) {

&nbsp;           e.printStackTrace();

&nbsp;       }

&nbsp;   }

}

