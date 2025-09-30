package _03__ConditionalStmt;

public class Switch {
    public static void main(String[] args) {
        int day = 3;
        switch (day){
            case 1,2,3,4,5,6,7:
                System.out.println("you have selected " + day);
                break;
            default:
                System.out.println("default statement");
        }
    }
}
