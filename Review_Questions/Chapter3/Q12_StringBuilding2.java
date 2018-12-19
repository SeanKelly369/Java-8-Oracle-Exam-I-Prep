package Review_Questions;

public class Q12_StringBuilding2 {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8); // 0189
        System.out.println(numbers);
        numbers.append("-").insert(2, "+"); // 01+89-
        System.out.println(numbers);
    }
}
