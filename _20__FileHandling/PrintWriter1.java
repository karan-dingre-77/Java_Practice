package _20__FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriter1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\PrintWriter.txt");
        file.createNewFile();
        PrintWriter pwr = new PrintWriter(file);
        pwr.println("karan ashok dingre");
        pwr.println("hello i am learning java");
        pwr.println(123);
        pwr.println(34);
        pwr.print(323);
//        System.out.println(pwr.printf("%d", 4));
        pwr.flush();

        Scanner sc = new Scanner(file);
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());


    }
}
