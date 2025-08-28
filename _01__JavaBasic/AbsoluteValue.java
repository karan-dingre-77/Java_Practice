package _01__JavaBasic;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check is it absolute or not hello: ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("This is original number: ");
        }else{
          int orgn = ~(num + 1);
            System.out.println("This is converted value " + orgn);
        }
    }
}
