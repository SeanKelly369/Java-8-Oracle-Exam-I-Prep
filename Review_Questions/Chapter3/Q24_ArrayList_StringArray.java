package Review_Questions;

import java.util.List;

public class Q24_ArrayList_StringArray {
    public static void main(String[] args) {
        String [] names = {"Tom", "Dick", "Harry"};

        // no .asList() method
//        List<String> list = names.asList();
//        list.set(0, "Sue");
        System.out.println(names[0]);
    }
}
