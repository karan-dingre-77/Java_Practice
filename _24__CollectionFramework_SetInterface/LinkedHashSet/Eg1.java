package _24__CollectionFramework_SetInterface.LinkedHashSet;

import java.util.LinkedHashSet;

public class Eg1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        System.out.println(hs.size());
        for(int i=1; i<=16; i++){
            hs.add(i);
        }
        hs.add(null);
        hs.add(2);
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
