package _18__ExceptionHandling;

class demo{
    public static void wait1() throws InterruptedException{
        for(int i=1; i<=10; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

public class exceptionEg {
    public static void main(String[] args) {
        try{
            demo.wait1();
            int d = 10/0;
        }catch (Exception e){
            System.out.println("Exception handled..");
        }
        System.out.println("main method ended..");
    }
}
