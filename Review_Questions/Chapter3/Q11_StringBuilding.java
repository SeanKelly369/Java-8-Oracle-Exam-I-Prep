package Review_Questions;

public class Q11_StringBuilding {
    public static void main(String[] args) {
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length(); // causes an exception
        System.out.println(total);
    }
}
