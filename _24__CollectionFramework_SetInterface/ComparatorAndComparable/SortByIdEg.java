package _24__CollectionFramework_SetInterface.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

class Student1{
    int id;
    String name;
    Student1(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class SortById implements Comparator<Student1> {
     public int compare(Student1 s1, Student1 s2) {
        return s1.id - s2.id;
    }
}
public class SortByIdEg {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1(3,"karan"));
        list.add(new Student1(2,"Mahesh"));
        list.add(new Student1(1,"Omkar"));

        Collections.sort(list, new SortById());

        for(Student1 s : list){
            System.out.println(s.id + " " + s.name);
        }

    }
}
