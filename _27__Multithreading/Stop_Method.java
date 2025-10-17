package _27__Multithreading;

class Stop extends Thread{
    public void run() {
        for(int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Stop_Method {
    public static void main(String[] args) {
        Stop t1 = new Stop();
        Stop t2 = new Stop();
        t1.start();
        t2.start();
//        t1.stop();  -> stop() method is deprecated
    }
}
