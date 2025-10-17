package _27__Multithreading;

class Yield implements Runnable{
    public void run(){
      for(int i=1; i<=3; i++){
          System.out.println(Thread.currentThread().getName());
          Thread.yield();
      }
    }
}
public class Yield_Method {
    public static void main(String[] args) {
        Yield task = new Yield();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
        // Set priorities to Threads
        t1.setPriority(1);
        t2.setPriority(6);
        t3.setPriority(10);

    }
}
