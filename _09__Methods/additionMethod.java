package _09__Methods;

class mul{
    static void mult(int c , int y){
        System.out.println(c*y);
    }
}
public class additionMethod {
    void add(int a , int b){
        System.out.println("addition of " + a + " and " + b + " is : " + (a+b));
    }
    public static void main(String[] args){
        additionMethod obj1 = new additionMethod();
        obj1.add(5,3);

        //ul ob = new mul();
        mul.mult(10,2);
    }
}
