package _04__Loops.inTheClass;

public class forloop {
    public static void main(String[] args) {
////        for(int i=1; i<=10; i = i+2){
////            System.out.println(i);
////        }
////        System.out.println();
////        for (int i=1; i<=10; i=i+3){
////            System.out.println(i);
////        }
//        int sum = 0; // 55
//        for(int i=1; i<=10; i++){ // 1<=10, 2<=10, 3<=10, 4<=10, 5<=10, 6<=10, 7<=10, 8<=10, 9<=10, 10<=10 11<=10 F
//            sum = sum + i;
//            // sum = 0 + 1;
//            // sum = 1 + 2;
//            // sum = 3 + 3;
//            // sum = 6 + 4;
//            // sum = 10 + 5;
//            // sum = 15 + 6;
//            // sum = 21 + 7;
//            // sum = 28 + 8;
//            // sum = 36 + 9;
//            // sum = 45 + 10;
//        }
//        System.out.println("Sum of 1 to 10 is : " + sum);
//
//        //Factorial program
//
//        int fact = 1; //120
//        for(int i=1; i<=5; i++){ //1<=5, 2<=5,3<=5, 4<=5, 5<=5,
//            fact = fact*i;
//            //fact = 1*1;
//            //fact = 1*2;
//            //fact = 2*3;
//            //fact = 6*4;
//            //fact = 24*5;
//        }
//        System.out.println("Factorial of 1 to 5 is : " + fact);

        int sum = 0;
        int osum = 0;
        System.out.print("even : " );
        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println(" = " + sum);
        System.out.println();
        System.out.print("odd : ");
        for(int i=1; i<=10; i++){
            if(i%2!=0){
                System.out.print(i + " ");
                osum += i;
            }
        }
        System.out.println(" = " + osum);




    }
}
