package _18__ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

class A{
    public static void a() throws IOException {
        FileReader fileReader = new FileReader("Text.txt");
        fileReader.close();
    }
}

public class throwsEg2 {
    public static void main(String[] args) {
        try{
            A.a();
        }
        catch (Exception e){
            System.out.println("File not found");
        }
    }
}
