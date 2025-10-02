package _08__OOPs.InnerClass;

class OuterClass{

   private OuterClass(){
        System.out.println("hello");
    }
   OuterClass(int a){
       this();
        System.out.println(a);
    }
    int num;
    public void outerMethod(){
        System.out.println("in the outer class and outer method. " + num);
    }
// Inner class starts from here
    static class Innner{
        int num1;
        public void innerMethod(){
            System.out.println("in the inner class and inner method. " + num1);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass(3);
        obj.outerMethod();

        OuterClass.Innner obj2 = new OuterClass.Innner();
        obj2.innerMethod();
    }
}
