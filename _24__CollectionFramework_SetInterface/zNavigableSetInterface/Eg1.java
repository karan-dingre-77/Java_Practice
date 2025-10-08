package _24__CollectionFramework_SetInterface.zNavigableSetInterface;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Eg1 {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(2);
        ns.add(4);
        ns.add(5);
        ns.add(1);
        ns.add(3);
        System.out.println(ns);
        System.out.println(ns.lower(3));
        System.out.println(ns.floor(2));
        System.out.println(ns.ceiling(3));
        System.out.println(ns.higher(4));
        System.out.println(ns.descendingSet());

        int ret = ns.pollFirst();
        System.out.println(ret);
        System.out.println(ns);

        int lret = ns.pollLast();
        System.out.println(lret);
        System.out.println(ns);
        System.out.println(ns.getLast());

    }
}
