package _11__Inheritence;

class parentClass{
    void display(){
        System.out.println("This is parent class ");
    }
}
class childClass extends parentClass{
    void show(){
        System.out.println("This is child class ");
    }
}

public class inherit {
    public static void main(String[] args) {
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
