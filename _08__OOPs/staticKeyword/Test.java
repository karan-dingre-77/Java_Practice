class Student {
    String name;
    static String school = "ABC School";  // shared by all students
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Karan";
        s1.school="XYZ school";

        Student s2 = new Student();
        s2.name = "Rahul";

        System.out.println(s1.name + " - " + Student.school);
        System.out.println(s2.name + " - " + Student.school);

        // Change static variable
        Student.school = "XYZ School";

        System.out.println(s1.name + " - " + Student.school); // reflects change
        System.out.println(s2.name + " - " + Student.school);
    }
}
