package _23__CollectionFramework_ListInterface.ArrayList;

import java.util.ArrayList;

public class Eg1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("");
        list.add("A");

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));

        for(String s : list){
            System.out.println(s);
        }

        System.out.println(list);

        list.add(2,"k");
        System.out.println(list);

         list.set(5,"D");
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

//       int size = list.size();
        System.out.println(list.size());

        System.out.println(list.contains("k"));

        System.out.println(list);

        System.out.println(list.lastIndexOf("D"));

        System.out.println(list.subList(1,4));
        System.out.println(list);

        list.clear();
        System.out.println(list);

    }

}
