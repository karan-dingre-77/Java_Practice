package _23__CollectionFramework_ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("wake up at 5am ");
        list.add("brush the teeth");
        list.add("take a bath ");
        list.add("breakfast ");
        list.add("got to the class");

        int i=1;
        for(String s : list){
            System.out.println( i + "] " + s);
            i++;
        }


        list.remove(3);
        System.out.println(list);

        list.set(4,"wadapaw");
        System.out.println(list);



        // checked size increasing automatically

//        System.out.println(list.size());
//        list.add("hello guys");
//        System.out.println(list.size());
//        list.add("hello guys");
//        list.add("hello guys");
//        list.add("hello guys");
//        list.add("hello guys");
//        System.out.println(list.size());
//
//        list.add("size increased");
//        list.add("hello guys");
//        System.out.println(list);
//        System.out.println(list.size());



    }
}
