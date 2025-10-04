package _22__Generics;

class Box1<T>{
    private T name;
    public Box1(T name){
        this.name = name;
    }
    T getValue(){
        return name;
    }
}

public class Eg1 {
    public static void main(String[] args){

        Box1<String> box = new Box1<>("hello i am karan and i am learning java");
        System.out.println(box.getValue());

        Box1<Integer> box1 = new Box1<>(123);
        System.out.println(box1.getValue());



    }
}
