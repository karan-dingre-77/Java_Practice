package _27__Multithreading;

class myThread1 implements Runnable{
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("Hello world...");
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class ByImplementing_RunnableInterface {
    public static void main(String[] args) throws InterruptedException{
        myThread1 t = new myThread1();
        Thread task = new Thread(t);
        task.start();
        for(int i=1; i<=5; i++){
            System.out.println("In main thread...");
            Thread.sleep(1000);
        }
    }
}
