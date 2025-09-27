package _20__FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File myFile = new File("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\Text.txt");
        try{
            if(myFile.createNewFile()){
                System.out.println("file created successfully");
            }
            else{
                System.out.println("file already exist");
            }
            System.out.println(myFile.exists());
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
