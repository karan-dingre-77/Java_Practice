package D4TakingInput;

import java.util.Scanner;

public class input_in_java2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter the long charecter");
//        String name = sc.nextLine();

        System.out.println("enter single char");
        char name1 = sc.next().charAt(1);

//        System.out.println("you have entered " + name);
        System.out.println("you entered single char " + name1);
    }
}