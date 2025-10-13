package _26__CollectionFramework_MapInterface;


// LinkedHashMap maintains the insertion order

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer, String> lm = new java.util.LinkedHashMap<>();
        lm.put(2,"a");
        lm.put(3,"b");
        lm.put(1,"c");
        System.out.println(lm);
        System.out.println(lm.get(3));
        lm.remove(1);
        System.out.println(lm);
        lm.put(4, "karan");
        System.out.println(lm);
    }
}
