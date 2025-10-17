package _27__Multithreading;

class Interrupt extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread terminated..");
            }
        }
    }
}
public class InterruptMethod {
    public static void main(String[] args) {
        Interrupt t = new Interrupt();
        Interrupt t2 = new Interrupt();
        t.start();
        t2.start();
        t.interrupt();
        t2.interrupt();
    }
}
