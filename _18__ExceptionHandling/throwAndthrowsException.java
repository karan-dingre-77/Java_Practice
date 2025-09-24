package _18__ExceptionHandling;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
class prtc{
    static void call(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age must be greater than 18");
        }
        else{
            System.out.println("You can vote");
        }
    }
}
public class throwAndthrowsException {
    public static void main(String[] args) {
        try {
            prtc.call(12);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("invalid age Exception handled.");
        }
    }
}
