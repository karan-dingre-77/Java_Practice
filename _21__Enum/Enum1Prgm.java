package _21__Enum;

enum Day {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class Enum1Prgm {
    public static void main(String[] args) {
        Day d = Day.Tuesday;
        System.out.println(d);
        System.out.println(d.ordinal());
        switch (d){
            case Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday -> System.out.println(d);
        }
    }
}
