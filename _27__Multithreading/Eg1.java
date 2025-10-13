package _27__Multithreading;

class A extends Thread{
    public void run(){
       for(int i=1; i<=5; i++){
           System.out.println("Child Thread...");
       }
    }
}
class B extends Thread{
    public void run(){
       for(int i=1; i<=5; i++){
           System.out.println("B running...");
       }
    }
}
public class Eg1 {
    public static void main(String[] args) {
        A t1 = new A();
        t1.start();
        B t2 = new B();
        t2.start();
        for(int i=1; i<=5; i++){
            System.out.println("Main Thread...");
        }
    }
}