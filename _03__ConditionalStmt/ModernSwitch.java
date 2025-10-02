package _03__ConditionalStmt;

public class ModernSwitch {
    public static void main(String[] args) {
        int day = 2;
        switch (day){

             case 1,2,3,4,5,6,7-> System.out.println(day);

//            case 1-> System.out.println(day);
//            case 2-> System.out.println(day);
//            case 3-> System.out.println(day);
//            case 4-> System.out.println(day);
//            case 5-> System.out.println(day);
//            case 6-> System.out.println(day);
//            case 7-> System.out.println(day);

            default -> System.out.println("I am default");
        }
    }
}
