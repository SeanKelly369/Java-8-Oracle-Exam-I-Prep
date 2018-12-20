import java.util.List;
import java.util.*;

class Main {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Tony");
    names.add("Jimmy");
    names.add("Anthony");

    Object[] namesArray = names.toArray();
    System.out.println(namesArray.length);

    String[] stringArray = names.toArray(new String[0]);

    String[] anotherStringArray = names.toArray(new String[names.size()]); // time consuming

    String[] petsArray = new String[] {"dog", "cat", "parrot"};
    // List<String> petsList = Arrays.asList(petsArray);
    List<String> petsList = Arrays.asList(petsArray);  // returns fixed sized list
    System.out.println(petsList.size());

    petsList.set(0, "bird");
    System.out.println(petsList); // 24 & 25 produce the same output of [bird, cat, parrot]
    System.out.println(Arrays.toString(petsArray));

    petsArray[0] = "husky";
    System.out.println(petsList); // 28 & 29 product same output [husky, cat, parrot]
    System.out.println(Arrays.toString(petsArray));

    // UnsupportedOperationException for both .add and .remove
    // petsList.add("newDog"); // cannot add to fixed sized list
    // petsList.remove(1);

    List<String> list = Arrays.asList("one", "two", "three"); // fixed size
    System.out.println(list);
    list.add("four"); // Throws UnsupportedOperationException
  }
  
}
