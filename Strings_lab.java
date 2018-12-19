import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

public class Strings_lab {
    public static void main(String[] args) {
        String name = "Sean Kelly";
        StringBuilder nameReversed = new StringBuilder(name);
        nameReversed.reverse();
        System.out.println(nameReversed);

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true

        String a = "Hello World";
        String b = " Hello World".trim();
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true

        String c = new String("Hello World");
        String d = "Hello World";
        System.out.println(c == d); // false

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5


    }
}
