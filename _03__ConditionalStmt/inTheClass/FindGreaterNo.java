package _03__ConditionalStmt.inTheClass;
import java.util.Scanner;

public class FindGreaterNo {

    static{
        System.out.println("hello");
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1, num2;
        System.out.println("Enter two numbers : ");
       num1 = sc.nextInt();
       num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1+ " is greater than " + num2);
        }else{
            System.out.println(num1+ " is less than " + num2);
        }
    }
}
