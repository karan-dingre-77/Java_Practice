package _14__Encapsulation;

class student {
    int age;
    String name;

    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        if(age<=18){
            System.out.println(" under 18 boys are not allowed ");
        }else{
            this.age=age;
        }

    }
    void setName(String name){
        this.name=name;
    }
}

public class Studentexp {
    public static void main(String[] args) {
        student obj = new student();

        System.out.println(obj.getAge());
        obj.setAge(14);
        System.out.println(obj.getAge());

        obj.setName("karan");
        System.out.println(obj.getName());

    }
}
