package _20__FileHandling.FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// write single array to file

public class Eg1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\FileOutputStream\\Eg1.txt");
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(65);
        fos.write('b');
        fos.write('c');

        System.out.println("written data in text file");
        fos.close();

    }
}
