package _08__OOPs;

class cons{
    int id;
    String name;
    void data(){
        System.out.println("name : " + name + " id : " + id);
    }
    cons(){
        id = 232;
        name = " karan ";
    }
}

public class constructor {
    public static void main(String[] args) {
        cons c1 = new cons();
        c1.data();

        cons c2 = new cons();
        c2.data();
        c2.id = 44;
        c2.name= "hello";
        c2.data();
    }
}
