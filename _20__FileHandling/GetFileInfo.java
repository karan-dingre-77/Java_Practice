package _20__FileHandling;

import java.io.File;
import java.io.IOException;

public class GetFileInfo {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\Text.txt");
        File file1 = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\Text1.java");

        file1.createNewFile();
        if(file1.exists()){
            System.out.println("java file created");
            System.out.println(file1.getName());
            System.out.println(file1.getAbsolutePath());
            System.out.println(file1.canRead());
            System.out.println(file1.canWrite());
            System.out.println(file1.length());
            System.out.println(file1.getName());
        }
        else{
            System.out.println("file doesn't exists");
        }

        char ch = 'd';
        if(ch == 'd'){
            System.out.println(" you entered d means you want to delete this file and now file is deleted" + file1.delete());
        }

    }
}
