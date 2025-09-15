package _13__Interface;

interface remote{
    void poweron();
    void poweroff();
}

class sonyTv implements remote{
    public void poweron(){
        System.out.println("sonyTv is on");
    }
    public void poweroff(){
        System.out.println("sonyTv is off");
    }
}
class samsungTv implements remote {
    public void poweron() {
        System.out.println("samsungTv is on ");
    }

    public void poweroff() {
        System.out.println("samsungTv is off ");
    }
}
public class RemoteExm {
    public static void main(String[] args) {
        remote r;
        r = new sonyTv();
        r.poweron();
        r.poweroff();
        r = new samsungTv();
        r.poweron();
        r.poweroff();
    }
}
