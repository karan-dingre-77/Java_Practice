package _27__Multithreading;

class Mt extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=1; i<=3; i++){
            System.out.println(name);
        }
    }
}
public class CheckThreadScheduler_usingThreadClass {
    public static void main(String[] args) {
        Mt t1 = new Mt();
        Mt t2 = new Mt();
        Mt t3 = new Mt();
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.start();
        t2.start();
        t3.start();
        for(int i=1; i<=3; i++){
            System.out.println("main thread");
        }
    }
}
