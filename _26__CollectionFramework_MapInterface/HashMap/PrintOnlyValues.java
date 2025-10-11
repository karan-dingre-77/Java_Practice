package _26__CollectionFramework_MapInterface.HashMap;

import java.util.HashMap;

public class PrintOnlyValues {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(3, "C");
        hm.put(2, "B");
        hm.put(5, "E");
        hm.put(4, "D");
        System.out.println(hm);

        for(String s : hm.values()){
            System.out.println(s);
        }

    }
}
