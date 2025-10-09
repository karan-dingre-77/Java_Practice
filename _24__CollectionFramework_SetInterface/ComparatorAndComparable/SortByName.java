package _24__CollectionFramework_SetInterface.ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentData{
    int roll;
    String name;
    StudentData(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}

class SortByName1 implements Comparator<StudentData> {
    public int compare(StudentData s11, StudentData s22){
        return s11.name.compareTo(s22.name);
    }
}


public class SortByName {
    public static void main(String[] args) {
        ArrayList<StudentData> list = new ArrayList<>();
        list.add(new StudentData(12,"Karan"));
        list.add(new StudentData(13, "Amit"));
        list.add(new StudentData(22, "Ravi"));
        list.add(new StudentData(23, "Mahesh"));
        list.add(new StudentData(34, "Omkar"));

        Collections.sort(list, new SortByName1());

        for(StudentData s : list){
            System.out.println( s.roll + " " + s.name);
        }
    }
}
