public class firstPattern {
    public static void main(String[] args) {
        int n = 5;  // number of rows

        for (int i = 1; i <= n; i++) {
            // print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
    }
}
