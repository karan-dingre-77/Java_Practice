package _11__Inheritence.SuperKeyword;

class a{
    a(int a){
        System.out.println(a);
        System.out.println("Super class constructor");
    }
}
class b extends a{
    b(){
        super(29); // If we do not write super() then Java internally call parent class constructor before child class constructor
        System.out.println("Child class constructor");
    }
}

public class invokeParentClss_Constructor {
    public static void main(String[] args) {
        b o = new b();

    }
}
