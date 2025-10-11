package _26__CollectionFramework_MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class UsingForEach {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(3, "C");
        hm.put(2, "B");
        hm.put(5, "E");
        hm.put(4, "D");
        System.out.println(hm);

        // 1st way
        for(Integer key : hm.keySet()){
            System.out.println(key + "->" + hm.get(key));
        }

        // 2nd way
        for(Map.Entry<Integer, String> E : hm.entrySet()){
            System.out.println(E.getKey() + "--> " + E.getValue());
        }

    }
}
