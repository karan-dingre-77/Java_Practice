package _25__CollectionFramework_QueueInterface.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Eg1Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(6);
        q.add(2);
        q.add(3);
        q.add(1);
        q.add(34);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.peek());

    }
}
