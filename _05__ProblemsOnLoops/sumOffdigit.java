package _05__ProblemsOnLoops;
import java.util.Scanner;
public class sumOffdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int ns = 0;
        int an = 0;

        for( ; num>0 ; num+=0){
            ns = num%10;
            an += ns;
            num = num/10;
        }
        System.out.println(an);
    }
}