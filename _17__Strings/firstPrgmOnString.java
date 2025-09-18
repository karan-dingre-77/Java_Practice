package _17__Strings;

public class firstPrgmOnString {
    public static void main(String[] args) {

        // Concatination
        String fName = "Karan";
        String lName = "Karan";

        String fullName = fName + lName ;
        System.out.println(fullName);

        // Length Method --> it returns length of the any string
        System.out.println(fName.length());

        // charAt() Method --> it is use to access any charecter from specifiec index
        System.out.println(fName.charAt(0));

        // compare Strings
        if(fName.compareTo(lName) == 0 ){
            System.out.println(" both names are same ");
        }
        else {
            System.out.println(" Both are not same ");
        }

        // substring --> it returns piece of code
        String newName = "Hello everyone";
        System.out.println(newName.substring(6,11));
    }
}
