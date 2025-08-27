package D3ConditionalStmt;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        String result = (num%2 == 0) ? "number is even" : "number is odd ";
        System.out.println("Entered " + result);
    }
}
