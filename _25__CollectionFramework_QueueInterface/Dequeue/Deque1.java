package _25__CollectionFramework_QueueInterface.Dequeue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(34);
        dq.addFirst(35);
        dq.addFirst(32);
        dq.addLast(45);
        dq.addFirst(46);
        dq.addFirst(56);
        dq.addLast(56);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.peek());
    }
}
