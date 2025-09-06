package _08__OOPs;

class ticket{
    String m_name;
    int t_num;
    int t_price;
    int Time;

    ticket(String nm, int n, int p, int T){
        m_name = nm;
        t_num = n;
        t_price = p;
        Time = T;
    }

    void t_Info(){
        System.out.println(m_name + " " + t_num + " " + t_price + " " + Time);
    }
}

public class movieTicket {
    public static void main(String[] args) {

        ticket t1 = new ticket("darr",35,299,3);
        t1.t_Info();
    }
}
