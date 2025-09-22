package _18__ExceptionHandling;

public class multipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a=10, b=2, c;
            c = a/b;
            System.out.println(c);

            int arr[] = { 1, 2, 3, 4};
            System.out.println(arr[3]);

            String name = null;
            System.out.println(name.toUpperCase());
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println(" Array exception");
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(" All type exception");
        }
        finally{
            System.out.println("I will executes always...");
        }
    }
}
