package _08__OOPs;

class car{
    String color;
    int speed;
    void drive(){
        System.out.println("Car is driving...");
    }
}

public class carClass {
    public static void main(String[] args) {

        car c1 = new car();
        car c2 = new car();

        c1.color="red";
        c1.speed=300;
        System.out.println(c1.color);
        System.out.println(c1.speed);
        c1.drive();

        System.out.println();

        c2.color="yellow";
        c2.speed=299;
        System.out.println(c2.color);
        System.out.println(c2.speed);
        c2.drive();

    }
}
