package _08__OOPs;

class studdata{
    String name;
    int id;
    String email;
    int mobileNo;
    char div;

    studdata(String n, int i, String e, int m, char d){
        name = n;
        id = i;
        email = e;
        mobileNo = m;
        div = d;
    }
    void data(){
        System.out.println(name + " " +id+ " " + email + " " + mobileNo + " " + div);
    }
}

public class ParaConstructor {
    public static void main(String[] args) {
        studdata s1 = new studdata("karan", 343, "karan@gmail.com", 888777878, 'A' );
        s1.data();
        studdata s2 = new studdata("omkar", 4434, "om@gmail.com", 54588585, 'B' );
        s2.data();
        s2.name="mahesh";
        s2.data();
    }
}
