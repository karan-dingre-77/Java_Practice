package _08__OOPs.InnerClass;

abstract class A{
   abstract void show();
   abstract void show1();
}

public class Anonymous_AbstractClass {
    public static void main(String[] args) {
        A obj = new A(){
            void show(){
                System.out.println("Hello");
            }
            void show1(){
                System.out.println("hii");
            }
        };
        obj.show();
        obj.show1();
    }
}
