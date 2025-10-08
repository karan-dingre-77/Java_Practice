package _23__CollectionFramework_ListInterface.Stack;

import java.util.Stack;

public class Eg1 {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println(stk);

        System.out.println(stk.size());

        stk.pop();
        stk.pop();
        System.out.println(stk);

        System.out.println(stk.peek());

        System.out.println(stk.search(3));
        System.out.println(stk.search(1));

        System.out.println(stk.isEmpty());
    }
}
