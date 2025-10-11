package _25__CollectionFramework_QueueInterface.Dequeue;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(4);
        dq.offerFirst(2);
        dq.push(3);
        dq.push(1);
        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.peekLast());
    }
}
