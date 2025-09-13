package _11__Inheritence.SuperKeyword;

class animal{
    void eat(){
        System.out.println(" Animal is Eating.... ");
    }
    void bark(){
        System.out.println("Animal is Barking...");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("Dog is eating....");
    }
    void bark(){
        System.out.println("Dog is Barking...");
    }

    void work(){
        eat();
        bark();
        super.eat();
        super.bark();
    }
}

public class invokeParentClss_Method {
    public static void main(String[] args) {
        dog oI = new dog();
        oI.work();
    }
}
