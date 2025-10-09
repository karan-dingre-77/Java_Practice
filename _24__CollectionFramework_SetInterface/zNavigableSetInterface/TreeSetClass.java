package _24__CollectionFramework_SetInterface.zNavigableSetInterface;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(1);
//        ts.add(1);        --> duplicates and null not allowed
//        ts.add(null);
        System.out.println(ts);
    }
}
