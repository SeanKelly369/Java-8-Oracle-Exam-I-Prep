package Review_Questions;

public class Q10_String_Compile_Error {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;
//        System.out.println(a);
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals"); // equals prints
    }
}
