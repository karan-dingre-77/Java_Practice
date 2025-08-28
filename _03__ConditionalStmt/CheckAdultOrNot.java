package _03__ConditionalStmt;
import java.util.Scanner;
public class CheckAdultOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value to check, adult or child or tanageer ");
        int num = sc.nextInt();
        if(num<=0){
            System.out.println("please enter the valid number ");
        }else if(num<12){
            System.out.println("in this age man are child ");
        }else if(num>=12 && num<=18){
            System.out.println("in this age man are tenager ");
        }else{
            System.out.println("in this age man are adult ");
        }
    }
}
