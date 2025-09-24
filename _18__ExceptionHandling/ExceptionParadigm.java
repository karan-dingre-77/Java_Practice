package _18__ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;

public class ExceptionParadigm {
    public static void main(String[] args) {
        try{
            m1();
        }
        catch (Exception e){
            System.out.println("Exception handled...");
        }

    }
    static void m1() throws IOException{
        m2();
    }
    static void m2() throws IOException {
//        System.out.println(10/0);
        FileReader fileReader = new FileReader("text.txt");
    }
}
