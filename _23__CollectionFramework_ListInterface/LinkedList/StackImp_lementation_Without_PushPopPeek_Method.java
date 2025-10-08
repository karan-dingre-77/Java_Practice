package _23__CollectionFramework_ListInterface.LinkedList;

import java.util.LinkedList;


class Stack{
    LinkedList<Integer> llist;
    public Stack(){
        llist = new LinkedList<>();
    }
    void show(){
        System.out.println(llist);
    }
    void push(int num){
        llist.addFirst(num);
    }
    void pop(){
        llist.removeFirst();
    }
    void peek(){
        System.out.println(llist.getFirst());
    }
    void clear(){
        llist.clear();
        System.out.println(llist);
    }
}


public class StackImp_lementation_Without_PushPopPeek_Method {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.show();

        stack.push(6);
        stack.show();

        stack.pop();
        stack.show();

        stack.peek();
        stack.clear();
        stack.show();

    }
}