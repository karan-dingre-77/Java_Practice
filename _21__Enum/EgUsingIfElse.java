package _21__Enum;

enum status{
    Running, Pending, Failed, Success
}

public class EgUsingIfElse {
    public static void main(String[] args) {

        status s = status.Success;
        System.out.println(status.Running);

        // using switch statement

        switch (s){
            case Running, Pending, Failed, Success -> System.out.println(s);
        }

        // using If Else statement

//        if(s==status.Success)
//            System.out.println("Successfully connect");
//        else if(s==status.Failed)
//            System.out.println("Try again");
//        else if(s==status.Pending)
//            System.out.println("Please wait");
//        else if(s==status.Running)
//            System.out.println("Running");
//        else
//            System.out.println("done");

    }
}
