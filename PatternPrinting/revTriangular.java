package PatternPrinting;
import java.util.Scanner;
public class revTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
//        int c = sc.nextInt();

        for(int i=r; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
