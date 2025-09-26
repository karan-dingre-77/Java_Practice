package _19__WrapperClasses;

public class AutoBoxing {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num;      // happening automatic conversion of primitive data type into corresponding wrapper class
        System.out.println(num);
        System.out.println(obj);

        double dnum = 19.4;
        Double dobj = dnum;
        System.out.println(dnum);
        System.out.println(dobj);

    }
}
