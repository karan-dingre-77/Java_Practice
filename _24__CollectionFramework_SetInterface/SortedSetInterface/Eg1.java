package _24__CollectionFramework_SetInterface.SortedSetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class Eg1 {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(2);
        ss.add(4);
        ss.add(3);
        ss.add(5);
        ss.add(1);
        System.out.println(ss);
        System.out.println(ss.size());
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(4));
        System.out.println(ss.tailSet(4));
        System.out.println(ss.subSet(2,5));

    }
}
