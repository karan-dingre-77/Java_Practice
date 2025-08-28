package _05__ProblemsOnLoops;
import java.util.Scanner;
public class countNumOfdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number here : ");
        int num = sc.nextInt();
        int count = 0;
        for(    ; num>0 ; num+=0){
            count++;
            num=num/10;

        }
        System.out.println(count);
    }
}