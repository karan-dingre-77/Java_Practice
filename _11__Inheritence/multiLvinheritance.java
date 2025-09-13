package _11__Inheritence;

class A {
    void a(){
        System.out.println("class A ");
    }
}
class B extends A {
    void b(){
        System.out.println("class B ");
    }
}
class C extends B{
    void c(){
        System.out.println("class c ");
    }
}

public class multiLvinheritance {
    public static void main(String[] args) {
        C o1 = new C();
        o1.a();
        o1.b();
        o1.c();
        B o2 = new B();
        o2.a();
        o2.b();
        A o3 = new A();
        o3.a();
    }
}
