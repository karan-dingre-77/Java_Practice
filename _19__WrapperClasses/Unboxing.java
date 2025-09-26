package _19__WrapperClasses;

public class Unboxing {
    public static void main(String[] args) {
        int num = 123;
        Integer iobj = num; // autoboxing
        System.out.println(iobj); // 123

        int x = iobj;       // unboxing
        System.out.println(x);

    }
}
