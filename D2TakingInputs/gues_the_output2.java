package D2TakingInputs;

import java.util.Scanner;

public class gues_the_output2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter charecter hello ");
        String p = sc.next();                   //This program will through error of mismatchexeption
        int q = sc.nextInt();

        System.out.println( p + " " + q);
    }
}
