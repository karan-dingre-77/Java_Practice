package _15__Abstraction;

abstract class Car{

    abstract public void fueltype();

    public void color(){
        System.out.println(" Black ");
    }
}

class tata extends Car{
    public void fueltype(){
        System.out.println(" diesel ");
    }
}

public class exp1 {
    public static void main(String[] args) {
        tata obj = new tata();
        obj.fueltype();
        obj.color();
    }
}
