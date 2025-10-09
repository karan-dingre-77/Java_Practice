package _25__CollectionFramework_QueueInterface.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(13);
        q1.add(34);
        q1.add(23);
        q1.add(45);
        System.out.println(q1);
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.poll());
        System.out.println(q1.poll());
    }
}
