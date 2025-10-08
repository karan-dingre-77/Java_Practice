package _23__CollectionFramework_ListInterface.LinkedList;

import java.util.LinkedList;

public class Eg1 {
    public static void main(String[] args) {

        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);

        for(Integer num : llist){
            System.out.println(num);
        }

        System.out.println(llist);
        System.out.println(llist.size());
        System.out.println(llist.get(3));
        System.out.println(llist.getFirst());
        System.out.println(llist.getLast());

        llist.addFirst(12);
        llist.addLast(234);
        System.out.println(llist);

    }
}
