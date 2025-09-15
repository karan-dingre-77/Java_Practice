package _12__polymorphism;

// CompileTime Polymorphism is also called method overloading

public class CompileTimePolysmorphism {

   static void A(){
        System.out.println("Method A");
    }
    static void A(int a, int b){
        System.out.println( a + b );
    }
    static void A(String a, String b){
        System.out.println( a + b);
    }

    public static void main(String[] args) {
       A();
       A(12,34);
       A("Karan","Dingre");
    }
}
