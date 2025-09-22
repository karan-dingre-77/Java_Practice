package _18__ExceptionHandling;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try {
            int a=10,b=0,c;
            c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(" can't divided by zero");
        }
        try{
            int a[] = { 10, 20, 30, 40};
            System.out.println(a[5]);
        }
        catch (Exception e){
            System.out.println("beyond the array limit");
        }
        System.out.println("main method end");
    }
}
