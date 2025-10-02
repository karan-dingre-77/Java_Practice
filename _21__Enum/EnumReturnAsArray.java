package _21__Enum;

enum alpha {
    a,b,c,d,e,f,g,h;
}

public class EnumReturnAsArray {
    public static void main(String[] args) {

        alpha[] chare = alpha.values();

        System.out.println(chare[3]);

        for(alpha s : chare){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
