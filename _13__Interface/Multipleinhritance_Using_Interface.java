package _13__Interface;

interface runInterfaceA{
    void run();
}
interface runInterfaceB{
    void run();
}

class c implements runInterfaceA,runInterfaceB{
   public void run(){
        System.out.println("Class run method ");
    }
}

public class Multipleinhritance_Using_Interface {
    public static void main(String[] args) {
        c obj = new c();
        obj.run();
    }
}
