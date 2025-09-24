package _18__ExceptionHandling;

class Div{
    static void div(int a, int b){
        if(b==0){
            System.out.println(" 1 exception caught");
            throw new ArithmeticException(" not / by zero");
        }else{
            System.out.println(a/10);
        }
    }
}

public class throwEg1 {
    public static void main(String[] args) {
        Div.div(10,0);
        System.out.println("This line will not compile because method caller is not present in the try block");
    }
}
