//package _24__CollectionFramework_SetInterface.ComparatorAndComparable;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Emp{
//    int id;
//    String name;
//    double sallary;
//
//    Emp(int id, String name, double sallary){
//        this.id = id;
//        this.name = name;
//        this.sallary = sallary;
//    }
//}
//
//class SortBySallary1 implements Comparator<Emp>{
//    public int compare(Emp e1, Emp e2){
//        return Double.compare(e1.sallary, e2.sallary);
//    }
//}
//
//public class SortBySallary {
//    public static void main(String[] args) {
//        ArrayList<Emp> list = new ArrayList<>();
//        list.add(12, "karan", 54.566);
//        list.add(13, "Mahesh", 53.566);
//        list.add(14, "Omkar", 52.566);
//
//        Collections.sort(list, new SortBySallary1());
//
//        for(Emp s : list){
//            System.out.println(s.id + " " + s.name + " " + s.sallary);
//        }
//
//    }
//}
