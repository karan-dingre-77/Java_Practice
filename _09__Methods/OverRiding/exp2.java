package _09__Methods.OverRiding;

class parent {
    void show(){
        System.out.println("parent class show method : ");
    }
}
class child extends parent{
    void show(){
        System.out.println("child class show method : ");
    }

}

public class exp2 {
    public static void main(String[] args) {
         parent o1 = new parent();
         o1.show();
         parent o2 = new child();
         o2.show();
    }
}
