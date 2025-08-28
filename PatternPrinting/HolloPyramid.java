package PatternPrinting;
import java.util.Scanner;
public class HolloPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){            // <--- this loop for rows
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i-1; k++) {
                if (i == r || k == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            for(int l=1; l<=i; l++){
                if(i==r || l==i ){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
