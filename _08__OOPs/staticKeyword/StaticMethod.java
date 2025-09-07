package _08__OOPs.staticKeyword;

class s_var{
    static int age;
    static void StaticMethod(){
        age = 10;
        System.out.println(age);

        hello();
    }
    static void hello(){
        System.out.println("hello world");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        s_var.StaticMethod();
    }
}
