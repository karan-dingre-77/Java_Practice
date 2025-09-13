package _11__Inheritence.SuperKeyword;

class one{
    int age = 30;
}
class two extends one{
    int age = 20;
    void m1(){
        System.out.println("Child Class --> age : " + age);
        System.out.println("Super Class --> age : " + super.age);
    }
}

public class invokeParentClss_Variable {
    public static void main(String[] args) {
        two obj1 = new two();
        obj1.m1();
    }
}
