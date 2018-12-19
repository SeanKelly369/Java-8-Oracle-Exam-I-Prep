package Review_Questions;

public class Q8_String_Numbers {
    public static void main(String[] args) {
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3)); // 12
        System.out.println(numbers.substring(7,7)); // blank line
        System.out.println(numbers.substring(7)); // 78
    }
}
