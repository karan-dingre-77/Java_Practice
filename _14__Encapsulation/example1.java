package _14__Encapsulation;

class A{
    private int value;  // Data hiding
    public void setValue(int value){   // data abstraction
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}

public class example1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.setValue(40);
        System.out.println(obj.getValue());
    }
}
