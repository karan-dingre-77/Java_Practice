package _12__polymorphism;

class animal{
    void sound(){
        System.out.println(" Animal Sound");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println(" Dog bark");
    }
}
class cat extends animal{
    @Override
    void sound(){
        System.out.println(" cat meow");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        animal a;
        a = new dog();
        a.sound();
        a = new cat();
        a.sound();
        a.sound();
        a = new dog();
        a.sound();
    }
}
