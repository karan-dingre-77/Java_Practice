package _23__CollectionFramework_ListInterface.Vector;

import java.util.Vector;

public class Eg1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(2);
        v.addElement(3);
        v.addElement(5);
        v.addElement(5);
        v.addElement(6);
        System.out.println(v.elementAt(2));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.removeElement(5);
        v.removeElement(5);
        System.out.println(v);

    }
}
