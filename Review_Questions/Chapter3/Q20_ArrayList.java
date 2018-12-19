package Review_Questions;

import java.util.ArrayList;
import java.util.List;

public class Q20_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
//        list.add(7); // won't work, declared as String ArrayList
        for(String s : list) System.out.println(s);
    }
}
