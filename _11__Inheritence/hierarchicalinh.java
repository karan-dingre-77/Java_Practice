package _11__Inheritence;

class x{
    void print(){
        System.out.println(" class x ");
    }
}
class y extends x{
    void y(){
        System.out.println(" class y ");
    }
}
class z extends x{
    void z(){
        System.out.println(" class z ");
    }
}

public class hierarchicalinh {
    public static void main(String[] args) {
        y o = new y();
        o.print();
        z o1 = new z();
        o1.print();
    }
}
