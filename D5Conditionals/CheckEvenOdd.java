package D5Conditionals;
import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check even or odd : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("entered number is even " + num);
        }else{
            System.out.println("entered number is odd " + num);
        }
    }
}
