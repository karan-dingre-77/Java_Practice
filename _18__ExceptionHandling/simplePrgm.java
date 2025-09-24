package _18__ExceptionHandling.indianProgrammerLecturePRGM;

public class first {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try{
//            System.out.println(arr[6]);
            System.out.println(10/0);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
