package Review_Questions;

public class Q9_String_immutability {
    public static void main(String[] args) {
        String s = "purr";
        s.toUpperCase(); // assigned to no String variable
        s.trim(); // assigned to no String variable
        s.substring(1, 3); // assigned to no String variable
        s += " two"; // concatenated to s
        System.out.println(s.length());  // 8
    }
}
