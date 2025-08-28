package _03__ConditionalStmt;

import java.util.Scanner;

public class CheckDiviseblity {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check divisible by 2 and 3 or not: ");
        int value = sc.nextInt();
        if(value%2==0 && value%3==0){
            System.out.println("enter number is divesible by 2 and 3: ");
        }else{
            System.out.println("Entered number is not divisible by 2 and 3: ");
        }
    }
}
