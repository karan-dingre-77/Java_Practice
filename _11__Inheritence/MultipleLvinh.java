package _11__Inheritence;

class A1{
    void same(){
        System.out.println("A1 and B1 have same Methods : ");
    }
}
class B1{
    void same(){
        System.out.println("A1 and B1 have same Methods : ");
    }
}
class C1 /*extends A1,B1*/{ // java does't support Multiple inheritance because of the ambiguity problem

}

public class MultipleLvinh {
    public static void main(String[] args) {
        // in the multiple level inheritance there is only one sub class of multiple super classes


    }
}
