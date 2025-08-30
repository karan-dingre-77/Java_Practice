package _06__PatternPrinting;
import java.util.Scanner;
public class JustPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int r = sc.nextInt();

        // Numerical holo Pyramid

        for(int i=1; i<=r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i-1; k++) {
                if (k == 1 || i==r) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            for(int l=1; l<=i; l++){
                if(i==r || l==i){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // numerical pattern
//        12345
//        23451
//        34512
//        45123
//        51234

//        System.out.println("enter number : ");
//        for(int i=1; i<=r; i++){
//            for(int j=i; j<=r; j++){
//                System.out.print(j);
//            }
//            for(int k=1; k<=i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }


        //simple numerical pattern

//        int c = sc.nextInt();
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //numberical pattern
        //121212
        //212121
        //121212

//        int c = sc.nextInt();
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                if((i+j)%2==0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(2);
//                }
//            }
//            System.out.println();
//        }


        // *** Rectangular Pattern

//        int c = sc.nextInt();
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                if(i==1 || i==r || j==1 || j==c){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        // **** Pyramid Triangle

//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            for(int l=1; l<=i-1; l++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // simple Ractangular pattern

//        int c = sc.nextInt();
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Triangular pattern

//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Reverse trangular

//        for(int i=1; i<=r; i++){
//            for(int j=r; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




    }
}














