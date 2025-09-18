package _16__Arrays.TWO_D_Array;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter row");
        int row = sc.nextInt();
        System.out.println(" enter the column");
        int col = sc.nextInt();
        System.out.println(" enter the value of x : ");
        int x = sc.nextInt();
        int [][] array = new int[row][col];
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length; j++){
                if(array[i][j] == x){
                    System.out.println(x + " value found at index number " + i + " " + j);
                }
            }
        }
    }
}
