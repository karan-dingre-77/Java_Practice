package _27__Multithreading;

class bank extends Thread{
    int balance = 5000;
    int withdraw;
    public bank(int withdraw){
        this.withdraw = withdraw;
    }
    public void run(){
        if(withdraw < balance){
            balance = balance - withdraw;
            System.out.println("Current balance is : " + balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
public class StaticSynchronizetion {
    public static void main(String[] args) {
        bank obj = new bank(3000);
        Thread t1 = new Thread(obj);
//        Thread t2 = new Thread(obj);
        t1.start();
//        t2.start();
    }
}
