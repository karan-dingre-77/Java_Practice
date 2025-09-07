package _08__OOPs.thisKeyword;

class This{
    int age;
    int id;
    String name;
    String course;

    This(){
        this(42, 4, "om", "Msc");
        System.out.println("This is default Constructor");
    }

    This(int age, int id, String name, String course){
//        this();
        System.out.println("initializing the values");
        this.age = age;
        this.id = id;
        this.name = name;
        this.course = course;
        System.out.println("initialized all variables");
    }
    void info(){
        System.out.println(age + " " + id + " " + name + " " + course);
    }
}

public class ThisPrgm {
    public static void main(String[] args) {
//        This o1 = new This(12, 3, "karan", "Bsc");
//        o1.info();
          This o2 = new This();
          o2.info();
    }
}
