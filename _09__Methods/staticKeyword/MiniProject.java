package _09__Methods.staticKeyword;

class studentData{
    int id;
    String name;
    long phone;
    String email;
    String cource;
   static String cName = "G H Raisoni";
   static int studentCount = 0;
   static int c1 =0;

   studentData(int i, String n, long p, String e, String c){
       id = i;
       name = n;
       phone = p;
       email = e;
       cource = c;
       studentCount++;

   }
   void showD(){
       c1++;
       System.out.println(" Student no-- " + c1 );
       System.out.println("ID: " +id+ " | Name: " + name + " | Phone: " + phone + " | Email : " + email + " | Cource : " + cource + " | Collage Name:" + cName);
       System.out.println();
   }
}

public class MiniProject {
    static {
        System.out.println("I am the first");
    }
    public static void main(String[] args) {
        studentData s1 = new studentData(1,"karan", 801076485, "karan@gmail.com", "Bsc.cs");
        studentData s2 = new studentData(2,"omkar", 902172548, "omkar@gmail.com", "Msc.cs");
        studentData s3 = new studentData(3,"Mahesh", 702033746, "mahesh@gmail.com", "MBA");
        studentData s4 = new studentData(4,"jagguu", 995367352, "jagadish@gmail.com", "BBA");
        studentData s5 = new studentData(4,"jagguu", 995367352, "jagadish@gmail.com", "BBA");
        System.out.println();
        System.out.println("There are " + studentData.studentCount + " Students created account on this website");
        System.out.println();
        s1.showD();
        s2.showD();
        s3.showD();
        s4.showD();
        s5.showD();


    }
}
