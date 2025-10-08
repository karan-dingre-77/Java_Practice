package _24__CollectionFramework_SetInterface.HashSet;

import java.util.HashSet;

public class Eg1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(2);

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains(2));
        System.out.println(hs.remove(2));
        System.out.println(hs.size());
    }

}
