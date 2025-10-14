package _27__Multithreading;

class myTh implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(name);
        }
    }
}
public class CheckThreadScheduler {
    public static void main(String[] args) {
        myTh task = new myTh();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.start();
        t2.start();
        t3.start();

    }
}
