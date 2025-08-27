package ProblemsOnLoops;
import java.util.Scanner;
public class FindRaiseToThePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for a : ");
        int a = sc.nextInt();
        System.out.println("enter value for b : ");
        int b = sc.nextInt();
        int power = 1;
        for(int i=1; i<=b; i++){
            power *= a;
        }
        System.out.println(a +" raise to the power " + b + " is " + power );

    }
}