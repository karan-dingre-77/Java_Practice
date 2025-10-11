package _26__CollectionFramework_MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Eg1 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(2, "karan");
        m.put(1, "mahesh");
        m.put(3, "omkar");
        m.put(5, "amit");
        m.put(4, "ajay");
        System.out.println(m);
        System.out.println(m.get(2));
        System.out.println(m.get(1));
        m.remove(1);
        System.out.println(m);

        System.out.println(m.containsKey(5));
        System.out.println(m.containsKey(6));
        System.out.println(m.containsValue("karan"));
        System.out.println(m.containsValue("jagguu"));

        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());


    }
}
