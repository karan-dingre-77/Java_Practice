package _20__FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingOnFile {
    public static void main(String[] args) throws IOException {
        File wr = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\WritingOnFile.txt");
        wr.createNewFile();

        FileWriter fwr = new FileWriter(wr);
        fwr.write("hello guys\n");
        fwr.write("I have added this new line from program using file handling\n");
        fwr.close();

//        try{
//            FileWriter fr = new FileWriter("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\WritingOnFile.txt");
//            try{
//                fr.write("\nwrote in nested try catch block");
//            }
//            finally {
//                fr.close();
//            }
//        }catch (Exception e){
//            System.out.println("exception handled");
//        }

    }
}
