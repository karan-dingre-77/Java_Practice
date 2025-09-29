package _20__FileHandling;

import java.io.File;
import java.io.FileWriter;

public class RenameFile {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\RenameFile.text");
        File file1 = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\RenameFile1.text");

        file.createNewFile();

        FileWriter f = new FileWriter("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\RenameFile1.text");
        f.write("hello i am karan dingre learning java programming");
        f.flush();

        if(file.exists()){
            System.out.println(file.renameTo(file1));
        }
        else{
            System.out.println("file does't exist");
        }

    }
}
