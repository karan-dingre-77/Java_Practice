package _05__ProblemsOnLoops;
import java.util.Scanner;
public class PrintReversNumber {
    public static void main(String[] args) {
        int ln = 0;
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for( ; num>0 ; num+=0 ){
            ln = num%10;
            rev = rev * 10 + ln;
            num/=10;
        }
        System.out.println("reverse number is " + rev);
    }
}