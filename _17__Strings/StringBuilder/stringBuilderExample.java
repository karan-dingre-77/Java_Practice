package _17__Strings.StringBuilder;

public class stringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Karan");
        System.out.println(sb);

        // char at index
        // charAt(index Number);
        System.out.println(sb.charAt(0));

        // set char at index 0
        // setCharAt(index Number , charecter);
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // insert Character at index without replacing any charater
        sb.insert(0,'N');
        System.out.println(sb);
        sb.insert(5,'N');
        System.out.println(sb);

        // delete string from starting index to ending index
        sb.delete(5,6); // starting index is inclusive & ending index is exclusive
        System.out.println(sb);

        // append --> add characters at last
        sb.append('D');
        sb.append('K');
        System.out.println(sb);

        // length --> return length of string
        System.out.println(sb.length());

    }
}
