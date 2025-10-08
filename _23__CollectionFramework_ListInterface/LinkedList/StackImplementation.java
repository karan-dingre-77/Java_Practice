package _23__CollectionFramework_ListInterface.LinkedList;

import java.util.LinkedList;

public class StackImplementation {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("karan");
        llist.add("hii");
        llist.add("hello");
        llist.add("world");
        System.out.println(llist);

        llist.push("my name is karan");
        System.out.println(llist);

        llist.pop();
        System.out.println(llist);

        System.out.println(llist.peek());

        llist.push("Dingre");
        llist.push("KD");
        System.out.println(llist);

        llist.addLast("Dingre");
        System.out.println(llist);

        llist.addFirst("i am karan");
        System.out.println(llist);

        System.out.println(llist.getFirst());
        System.out.println(llist.getLast());
        System.out.println(llist.get(3));

        llist.removeLast();
        System.out.println(llist);


    }
}
