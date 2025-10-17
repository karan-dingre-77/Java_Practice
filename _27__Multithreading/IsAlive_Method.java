package _27__Multithreading;

class IsAlive extends Thread{
    public void run() {
        for(int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class IsAlive_Method {
    public static void main(String[] args) throws InterruptedException {
        IsAlive t1 = new IsAlive();
        IsAlive t2 = new IsAlive();
        System.out.println(t1.isAlive());   // false
        t1.start();
        System.out.println(t1.isAlive());   // true
        t1.join();
        System.out.println(t1.isAlive());   // false
        System.out.println(t2.isAlive());   // false
        t2.start();
        System.out.println(t2.isAlive());   // true

        System.out.println(t1.isAlive());   // false
    }
}
