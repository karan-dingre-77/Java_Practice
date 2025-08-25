package D4TakingInput;

import java.util.Scanner; // import java scanner class

public class input_in_java {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); //create obj of Scanner

        System.out.println("enter first number");
        int num_1 = sc.nextInt();

        System.out.println("enter second number");
        int num_2 = sc.nextInt();

        System.out.println("you have enter two numbers " + num_1 + " and " + num_2);



    }
}
