package _15__Abstraction;

abstract class vehicle{
    abstract public void start();
    public void stop(){
        System.out.println(" vehicle is stop ");
    }
}
class Car1 extends vehicle{
    public void start(){
        System.out.println(" Car has started ");
    }
}
class motorcycle extends vehicle{
    public void start(){
        System.out.println(" Motorcyle has started ");
    }
}

public class VehicleExp {
    public static void main(String[] args) {
        vehicle v1;
        v1 = new Car1();
        v1.start();
        v1.stop();

        v1 = new motorcycle();
        v1.start();
        v1.stop();


    }
}
