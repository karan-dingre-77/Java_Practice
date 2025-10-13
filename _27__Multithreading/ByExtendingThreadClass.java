package _27__Multithreading;

class MyThread extends Thread{
   public void run (){
       try{
           for(int i=1; i<=5; i++){
               System.out.println("child thread...");
               Thread.sleep(1000);
           }
       } catch (InterruptedException e) {
           System.out.println("exception handled");
           throw new RuntimeException(e);
       }
   }
}
public class ByExtendingThreadClass {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=1; i<=5; i++){
            System.out.println("main thread...");
            Thread.sleep(1000);
        }
    }
}

