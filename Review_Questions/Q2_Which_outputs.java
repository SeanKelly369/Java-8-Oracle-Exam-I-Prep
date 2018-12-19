package Review_Questions;

public class Q2_Which_outputs {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        if("Hello".equals(s)) System.out.println("one"); // prints
        if (t == s) System.out.println("two"); // does not print
        if (t.equals(s)) System.out.println("three"); // prints
        if ("Hello" == s) System.out.println("four"); // prints
        if ("Hello" == t) System.out.println("five"); // does not print
    }
}
