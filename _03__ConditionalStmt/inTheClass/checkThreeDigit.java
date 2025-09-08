package _03__ConditionalStmt.inTheClass;

import java.util.Scanner;

public class checkThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(num>99 && num<=999){
            System.out.println("this number is 3 digit");
        }else{
            System.out.println("this number is not 3 digit");
        }
    }
}
