package _15__Abstraction;

abstract class Animal{
    public abstract void sound();
    Animal(){
        System.out.println(" Animal sound...");
    }
}
class Dog extends Animal{
    Dog(){
//        super();
    }
    public void sound(){
        System.out.println(" Dog bark ");
    }
}
class Lion extends Animal{
    Lion(){
//        super();
    }
    public void sound(){
        System.out.println(" Lion roar ");
    }
}

public class AnimalsPrgm {
    public static void main(String[] args) {
        Animal obj;
        obj = new Dog();
        obj.sound();
        obj = new Lion();
        obj.sound();

    }
}
