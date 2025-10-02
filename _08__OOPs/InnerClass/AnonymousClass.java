package _08__OOPs.InnerClass;

class Animal{
    public void dog(){
        System.out.println("Dog is running...");
    }
}

public class AnonymousClass {
    public static void main(String args[]){
        Animal obj = new Animal(){
          public void dog(){
              System.out.println("Now Dog is barking...");
          }
        };
        obj.dog();
    }
}
