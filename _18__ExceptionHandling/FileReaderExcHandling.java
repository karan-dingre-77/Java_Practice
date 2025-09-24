package _18__ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExcHandling {
    public static void main(String[] args) {
       try{
           readFile();
       }
       catch (Exception e){
           System.out.println("Exception handled in main method");
       }
    }
    static void readFile() throws IOException{
        FileReader fileReader = new FileReader("Text.txt");
    }
}
