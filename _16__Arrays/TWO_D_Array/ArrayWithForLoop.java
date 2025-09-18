package _16__Arrays.TWO_D_Array;

import java.util.Scanner;

public class ArrayWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the row size of array : ");
        int row = sc.nextInt();
        System.out.println(" Enter the column size of array : ");
        int col = sc.nextInt();
        // Array declaration
        int [][] array = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]);
            }
        }
    }
}
