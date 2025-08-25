package D4TakingInput;

import java.util.Scanner;

public class sumprgm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1");
        int num1 = sc.nextInt();

        System.out.println("enter second number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
