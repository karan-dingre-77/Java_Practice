package _08__OOPs;

class student{
    String f_name;
    int rollNo;
    int age;
}
public class personclass {
    public static void main(String[] args) {

        student s1 = new student();
        s1.f_name= "karan";
        s1.rollNo= 55;
        s1.age   = 20;
        System.out.println("name : " + s1.f_name);
        System.out.println("rollNo : " + s1.rollNo);
        System.out.println("age : " + s1.age);

        student s2 = new student();
        s2.f_name= "omkar";
        s2.rollNo= 23;
        s2.age   = 25;
        System.out.println("name : " + s2.f_name);
        System.out.println("rollNo : " + s2.rollNo);
        System.out.println("age : " + s2.age);

    }
}
