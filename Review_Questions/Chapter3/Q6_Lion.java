package Review_Questions;

public class Q6_Lion {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!"); // immutable
        roar2.append("!!!"); // mutable
    }
    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Q6_Lion().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
        int length = roar1.length();
        System.out.println(length);
    }
}
