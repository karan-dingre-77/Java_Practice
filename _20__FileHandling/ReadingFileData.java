package _20__FileHandling;

import java.io.FileReader;

public class ReadingFileData {
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\WritingOnFile.txt");
            try{
                int i;
                while((i= fr.read()) != -1){
                    System.out.print((char) i);
                }
            }
            finally {
                fr.close();
                System.out.println("file closed");
            }
        }
        catch (Exception e){
            System.out.println(" Exception handled...");
        }


//        try{
//            FileReader fr = new FileReader("C:\\Users\\karan\\IdeaProjects\\Java Project\\src\\_20__FileHandling\\WritingOnFile.txt");
//            try{
//                int i;
//                i=fr.read();
//                while( i != -1){
//                    System.out.print((char) i);
//                    i=fr.read();
//                }
//            }
//            finally{
//                fr.close();
//            }
//        }
//        catch (Exception e){
//            System.out.println(" exception handled...");
//        }



    }
}
