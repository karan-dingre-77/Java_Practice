package _27__Multithreading;

class joinM extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException{
        joinM t1 = new joinM();
        joinM t2 = new joinM();
        joinM t3 = new joinM();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}
