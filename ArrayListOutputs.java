import java.util.*;

class JavaList {
  public static void main(String[] args) {
    ArrayList<String>myList = new ArrayList<>();
    myList.add("One");
    myList.add("Two");
    System.out.println(myList.contains(new String("One")));
    System.out.println(myList.indexOf("Two"));
    myList.clear();
    System.out.println(myList);
    // System.out.println(myList.get(1)); // Throws an exception
  }
}
