package _25__CollectionFramework_QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class Eg1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(24);
        q1.add(24);
        q1.add(22);
        q1.add(20);
        System.out.println(q1);
    }
}
