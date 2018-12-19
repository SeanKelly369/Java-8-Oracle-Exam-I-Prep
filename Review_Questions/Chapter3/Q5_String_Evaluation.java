package Review_Questions;

public class Q5_String_Evaluation {
    public static void main(String[] args) {
        String s1 = "java";
        StringBuilder s2 = new StringBuilder(("java"));
//        if (s1 == s2)  // == cannot be applied to String and StringBuilder
            System.out.println("1");
        if (s1.equals(s2))
            System.out.println("2");
    }
}
