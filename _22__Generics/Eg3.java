package _22__Generics;

class hello<T, V>{
    private T key;
    private V value;
    public hello(T key, V value){
        this.key = key;
        this.value = value;
    }
    void show(){
        System.out.println(key + " : " + value);
    }
}
public class Eg3 {
    public static void main(String[] args) {
        hello<Integer, String> obj = new hello<>(12, "karan");
        obj.show();

        hello<Double, Float> obj1 = new hello<>(44.44, 3.44f);
        obj1.show();

        hello<String, Character> obj2 = new hello<>("My name is karan", 'k');
        obj2.show();

        hello<String, String> obj3 = new hello<>("generics", "reduced the code");
        obj3.show();
    }
}
