package _10__AccessModifier;

class A {
    accessModifiers o1 = new accessModifiers();
    void print(){
        System.out.println("out side the class " + o1.name);
    }
}

// this class accessed by the  ---> Methods.additionMethod <--- Package
public class accessModifiers {

    public String name = " I am public member ";

    void printFromclass(){
        System.out.println("inside the same class :" + name);
    }

    public static void main(String[] args) {
        accessModifiers o1 = new accessModifiers();
        System.out.println(o1.name);
        o1.printFromclass();

        A a = new A();
        a.print();

    }
}
