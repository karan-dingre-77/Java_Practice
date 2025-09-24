package _18__ExceptionHandling;

public class throws_Keyword {
    public static void main(String[] args) throws InterruptedException{
        for(int i=1; i<=10; i++){
            System.out.println(i);
            System.out.println("number printing....");
            Thread.sleep(1000);
        }
    }
}
