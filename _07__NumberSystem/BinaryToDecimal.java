package _07__NumberSystem;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int b_num = 10110;
        int ans = 0;
        int pw = 1;
        while(b_num > 0){
           int lb = b_num%10;
            ans +=  (lb*pw);
            pw*=2;
            b_num /= 10;
        }
        System.out.println(ans);
    }
}
