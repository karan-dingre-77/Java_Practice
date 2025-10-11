package _26__CollectionFramework_MapInterface.HashMap;

import java.util.HashMap;

public class UsingLambdaExp {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(3, "C");
        hm.put(2, "B");
        hm.put(5, "E");
        hm.put(4, "D");
        System.out.println(hm);

        // Lambda expression
        hm.forEach((K, V) -> System.out.println(K + " : " + V));

        // print only key's
        for(Integer k : hm.keySet()){
            System.out.println(k);
        }

        // print only value's
        for(String v : hm.values()){
            System.out.println(v);
        }

    }
}
