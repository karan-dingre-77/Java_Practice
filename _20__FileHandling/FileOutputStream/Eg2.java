package _20__FileHandling.FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// Write entire array to file

public class Eg2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\FileOutputStream\\Eg2.txt");
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        String data = "hello programming!.... \n add text using byter array";
        byte[] bArray = data.getBytes();
        fos.write(bArray);

        fos.close();

    }
}
