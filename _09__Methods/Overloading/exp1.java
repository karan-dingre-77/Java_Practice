package _09__Methods.Overloading;

// Below methods will call base on parameters

class calc{
        static int sum(int a, int b){
            return a+b;
        }
        static int sum(int a, int b, int c){
            return a+b+c;
        }
        static String sum(String a, String b){
            return a+b;
        }
}

public class exp1 {
    public static void main(String[] args) {
        calc.sum(10,5);     //Call for two parameters method
        calc.sum(10,5,4);
        calc.sum("karan","dingre");
    }
}
