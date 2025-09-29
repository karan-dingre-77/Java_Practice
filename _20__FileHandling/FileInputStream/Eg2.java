package _20__FileHandling.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\FileOutputStream\\Eg2.txt");

        byte[] bArray = new byte[5];
        int byCount;
        while((byCount = fin.read(bArray)) != -1){
            System.out.print(new String(bArray,0,byCount));
        }

    }
}
