package _08__OOPs;

class overl{
    int roll;
    String name;
    String Class;

    overl(){
        roll=0;
        name="null";
        Class="null";
    }
    overl(int r,String n){
        roll=r;
        name=n;
    }
    overl(int r,String n,String C){
        roll=r;
        name=n;
        Class=C;
    }
    void load(){
        System.out.println(roll + " " + name + " " + Class );
    }
}

public class consOverloading {
    public static void main(String[] args) {
        overl o1 = new overl();
        overl o2 = new overl(233,"kk");
        overl o3 = new overl(23,"kd","mcs");
        o1.load();
        o2.load();
        o3.load();
    }
}
