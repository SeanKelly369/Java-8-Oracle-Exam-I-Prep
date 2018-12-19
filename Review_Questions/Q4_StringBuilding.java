package Review_Questions;

public class Q4_StringBuilding {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb); // B. abbacca
    }
}
