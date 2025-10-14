package _27__Multithreading;

class MyThread2 extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(1000); // TIMED_WAITING
        } catch (Exception e) {
            System.out.println("Exception handled...");
        }
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
                MyThread2 t = new MyThread2();

                System.out.println("1. " + t.getState()); // NEW
                t.start();
                System.out.println("2. " + t.getState()); // RUNNABLE

                Thread.sleep(100);
                System.out.println("3. " + t.getState()); // TIMED_WAITING (during sleep)

                t.join();
                System.out.println("4. " + t.getState()); // TERMINATED
            }
        }