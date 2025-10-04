package _22__Generics;

class Wrap<T>{
    private T pass;
    T num;
    Wrap(T num){
        this.num = num;
    }
    T getnum(){
        return num;
    }
    void setValue(T pass){
        this.pass = pass;
    }
    T getValue(){
        return pass;
    }
}

public class Eg2 {
    public static void main(String[] args) {

        Wrap<Integer> wrap = new Wrap<>(123);
        wrap.setValue(234);
        System.out.println(wrap.getValue());

        System.out.println(wrap.getnum());
    }
}
