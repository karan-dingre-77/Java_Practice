package _20__FileHandling.FileOutputStream;

// writes only part of the array to file

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Eg3 {
    public static void main(String[] args) throws IOException {
     File file = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\FileOutputStream\\Eg3.txt");
     file.createNewFile();

     FileOutputStream fos = new FileOutputStream(file);
     String data = "hello i am karan dingre";
     byte[] bArray = data.getBytes();
     fos.write(bArray,0,5);

     fos.close();

    }
}
