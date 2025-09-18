package _16__Arrays;

import java.util.Scanner;

public class PracticeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        System.out.println(" enter the x number : ");
        int x = sc.nextInt();
        System.out.println(" Enter the " + size + " values");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == x){
                System.out.println(numbers[i] + " found at Index number " + i);
            }
        }
    }
}
