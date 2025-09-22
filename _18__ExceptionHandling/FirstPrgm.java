package _18__ExceptionHandling;

public class FirstPrgm {
    public static void main(String[] args) {
        System.out.println(" Main method starts");
        int ans;
        try {
            ans = 10/0;
            System.out.println(ans);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(" number can't divided by zero");
        }
        System.out.println(" Main method ends");
    }
}
