package _11__Inheritence;

class employee{
    int age = 39;
    void salary(){
        System.out.println("salary = 70000 ");
    }
}
class hr extends employee{
    void bonus(){
        System.out.println("bonus = 2000 ");
    }
}

public class SingleLvLinheritance {
    public static void main(String[] args) {
        hr obj1 = new hr();
        obj1.salary();
        obj1.bonus();
        System.out.println(obj1.age);
    }

}
