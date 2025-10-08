package _24__CollectionFramework_SetInterface.HashSet;

import java.util.HashSet;

public class Eg2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("k");
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("A");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        hs.remove("");
        System.out.println(hs);
        System.out.println(hs.contains(null));
    }
}
