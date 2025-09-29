package _20__FileHandling.FileInputStream;

import java.io.*;

public class Eg1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fwr = new FileInputStream("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\FileOutputStream\\Eg1.txt");
        int i;
        while((i=fwr.read()) != -1){
            System.out.print((char)i);
        }
    }
}
