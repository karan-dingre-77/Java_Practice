
import java.util.Scanner;

public class MiniBank {
    private static int availB = 500;
    public static void withrdrow(int withdrow){
        if(withdrow<availB){
            System.out.println("withdrow " + withdrow + " rupees succesufully..\n");
            availB -= withdrow;
        }else{
            System.out.println("Insufficient balance -> you have only " + availB + "\n");
        }
    }
    public static void checkB(){
        System.out.println(" Available balance in your bank account is : " + availB + "\n");
    }
    public static void addFund(int fund){
        availB += fund;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int start = 1;
        while(start>0){
            System.out.println("enter the number  1]-> Check Balance   2]-> Add Fund   3]-> Withdrow   0]-> Exit");
            int enter = sc.nextInt();
            if(enter == 1){
                checkB();
            }else if(enter == 2){
                System.out.print("Add balance in your bank : ");
                int addB = sc.nextInt();
                System.out.println();
                addFund(addB);
            }else if(enter == 3){
                System.out.print("Enter balance to withdrow : ");
                int withdrow = sc.nextInt();
                withrdrow(withdrow);
            }
            else if(enter == 0){
                break;
            }
        }
        System.out.println("Thank You..");
        sc.close();
    }

}

