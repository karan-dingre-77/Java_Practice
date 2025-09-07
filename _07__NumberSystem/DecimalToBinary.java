package _07__NumberSystem;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while(num>0){
            int parity=num%2;
            ans = ans + (parity*pw);
            pw*=10;
            num/=2;
        }
        System.out.println(ans);
    }
}
