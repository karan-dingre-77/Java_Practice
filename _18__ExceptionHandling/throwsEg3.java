package _18__ExceptionHandling;

class div{
    static void div(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a/b);
        }
    }
}

public class throwsEg3 {
    public static void main(String[] args) {
        try{
            div.div(10,0);
        }catch (Exception e){
            System.out.println(e);
            System.out.println(" the value of b is zero ");
        }
    }
}
