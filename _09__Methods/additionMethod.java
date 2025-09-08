package _09__Methods;

import _10__AccessModifier.accessModifiers;

class mul{
    static void mult(int c , int y){
        System.out.println(c*y);
    }
}
public class additionMethod {
    void add(int a , int b){
        System.out.println("addition of " + a + " and " + b + " is : " + (a+b));
    }
    public static void main(String[] args){
        additionMethod obj1 = new additionMethod();
        obj1.add(5,3);

        //ul ob = new mul();
        mul.mult(10,2);


        // Access another package's / class's members

        accessModifiers o1 = new accessModifiers();
        System.out.println("This member accesss from another package " + o1.name);


    }
}
