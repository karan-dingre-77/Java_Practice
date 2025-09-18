package _16__Arrays;

import java.util.Scanner;

public class ArrayWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        for(int i=0; i<marks.length; i++){
            System.out.println(" enter value on index number " + i );
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.println( marks[i] + " << This value is from index number " + i);
        }

    }
}
