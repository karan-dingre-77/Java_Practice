package _27__Multithreading;

class Priorities22 extends Thread{
    public void run(){
        Thread.yield();
        for(int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
        }
    }
}
public class Priorities2 {
    public static void main(String[] args) {
        Priorities22 t1 = new Priorities22();
        Priorities22 t2 = new Priorities22();
        Priorities22 t3 = new Priorities22();

        t1.setPriority(10);
        t2.setPriority(9);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
    }
}
