package _05__ProblemsOnLoops;
import java.util.Scanner;
public class ReverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int mn = 0;
        for( ; n>0 ; n+=0){
            mn = n%10;
            n = n/10;
            System.out.print(mn);
        }
    }
}