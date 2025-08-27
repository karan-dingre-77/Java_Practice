package ProblemsOnLoops;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check factorial of that number : ");
        int n = sc.nextInt();
        int ans =1;

        for(int i =1; i<=n ; i++){
            ans *= i;
        }
        System.out.println("factorial of " + n + " is " + ans);
    }
}