package _18__ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Outer try block");
            try{
                System.out.println("Inner try block");
                int arr[] = {1,2,3,4,5};
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException ae){
                System.out.println(ae);
                System.out.println(" Array index exception");
            }
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println(" arithmetic Exception");
        }
    }
}
