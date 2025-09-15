package _13__Interface;

interface car{
    void start();
}
class electric implements car{
    public void start(){
        System.out.println(" electric Car is started...");
    }
}
class disiel implements car{
    public void start(){
        System.out.println(" disiel car is started...");
    }
}

public class CarExm {
    public static void main(String[] args) {
        car c;
        c = new electric();
        c.start();
        c = new disiel();
        c.start();
    }
}
