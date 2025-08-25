package D4TakingInput;

import java.util.Scanner;

public class calculate_interest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value of P ");
        float p = sc.nextFloat();

        System.out.println("enter value of T ");
        float t = sc.nextFloat();

        System.out.println("enter the value of R ");
        float r = sc.nextFloat();

        float si = (p*t*r)/100;

        System.out.println("simple interest is " + si);

    }
}
