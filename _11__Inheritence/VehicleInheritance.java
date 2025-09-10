package _11__Inheritence;

class vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}
class car extends vehicle{
    String ftype;
    boolean sunroof;
    String brand;
    car(double price, double mileage, String color, String ftype, boolean sunroof, String brand){
        this.price=price;
        this.mileage=mileage;
        this.color=color;
        this.ftype=ftype;
        this.sunroof=sunroof;
        this.brand=brand;
    }
    void show(){
        System.out.println(ftype);
        System.out.println(sunroof);
        System.out.println(brand);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        System.out.println("Car1");
        car car1 = new car(35000,50,"red", "petrol", true, "Fortuner");
        car1.display();
        car1.show();
        System.out.println();
        System.out.println("Car2");
        car car2 = new car(45000,60,"green", "disel", false, "Thar");
        car2.display();
        car2.show();

    }
}
