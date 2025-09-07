package _08__OOPs.staticKeyword;
class student{
    String name;
    int id;
    static String u_name = "abc";
}
public class StaticVariable {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        System.out.println(s1.u_name);
        System.out.println(s2.u_name);
        System.out.println(s3.u_name);

        s3.u_name = "xyz";

        System.out.println(s3.u_name);
        System.out.println(s2.u_name);
        System.out.println(s1.u_name);




    }
}
