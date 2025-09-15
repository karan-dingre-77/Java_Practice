package _13__Interface;

import java.util.Scanner;

interface client{
    void input();
    void output();
}

class developer implements client{
    String name; int sal;
    public void input(){
        System.out.println("enter the name and sallary : ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        sal = sc.nextInt();
    }
    public void output(){
        System.out.println("name is " + name);
        System.out.println("sallary is " + sal);
    }
}

public class ClientExample {
    public static void main(String[] args) {
        client r = new developer();
        r.input();
        r.output();
    }
}
