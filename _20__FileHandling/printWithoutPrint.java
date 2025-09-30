package _20__FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class printWithoutPrint {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\printWithoutPrint.txt");
        file.createNewFile();
        FileWriter fwr = new FileWriter(file);
        fwr.write("hi i am karan");
        fwr.close();

        FileReader fr = new FileReader(file);
        FileWriter output = new FileWriter("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\PrintWriter.txt");
        int i;
        while((i=fr.read()) != -1){
            output.write(i);
        }
        output.close();

    }
}
