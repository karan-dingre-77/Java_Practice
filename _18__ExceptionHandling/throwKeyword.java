package _18__ExceptionHandling;

import java.util.Scanner;

public class throwKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(), name = sc.nextInt();
        if(age < 18) {
//            System.out.println(" befor throw line");
            throw new IllegalArgumentException("Not eligible to vote");
//            System.out.println("after throw line");
        }else{
            throw new IllegalArgumentException("You are allowed to vote");
        }

//        System.out.println("This is user defined exception");
//        throw new ArithmeticException(" / by zero");

    }
}
