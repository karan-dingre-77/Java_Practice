package _27__Multithreading;

// suspend method and resume methods are suspended that's why they are giving error;
// suspended and resume are not working ;
class Suspend implements Runnable{
    public void run(){
       for(int i=1; i<=3; i++){
           System.out.println(Thread.currentThread().getName());
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
public class SuspendAndResume_Method {
    public static void main(String[] args) {
        Suspend task = new Suspend();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
//        t2.suspend();
//        t2.resume();
    }
}
