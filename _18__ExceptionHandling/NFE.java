package _18__ExceptionHandling;

// NumberFormatException

public class NFE {
    public static void main(String[] args) {
        String name = "karan"; // if you enter "123" then program will execute properly
        try {
            int num = Integer.parseInt(name);
            System.out.println(num);
        }
        catch (NumberFormatException n){
            System.out.println(n);
            System.out.println("String " + name + " can't be converted into integer ");
        }
    }
}
