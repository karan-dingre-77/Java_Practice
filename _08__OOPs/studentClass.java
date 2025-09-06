package _08__OOPs;

public class studentClass {
    String s_name;
    int rollno;

    public static void main(String[] args) {
        studentClass s_obj = new studentClass();

        System.out.println(s_obj.s_name);
        System.out.println(s_obj.rollno);

        s_obj.s_name = "karan dingre";      // initialize the variables from main method
        s_obj.rollno = 55;

        System.out.println(s_obj.s_name);      // Acces them using ( . )
        System.out.println(s_obj.rollno);

    }
}
