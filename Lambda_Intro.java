import java.util.*;
// import java.util.function;

class Animal {
  private String type;
  private boolean canJump;
  private boolean canSwim;

  public Animal (String type, boolean canJump, boolean canSwing) {
    this.type = type;
    this.canJump = canJump;
    this.canSwim = canSwim;
  }

  public boolean canJump() {
    return canJump;
  }

  public boolean canSwim() {
    return  canSwim;
  }

  public String getType() {
    return type;
  }
}

// Create interface for easy implementation
interface CheckAnimal { // functional interface, can be used with functions
  boolean check(Animal animal);
}

// Create class to implement interface
class CheckCanJump implements CheckAnimal {
  @Override
  public boolean check(Animal animal) {
    return animal.canJump();
  }
}

interface AnotherCheck {
  boolean check(Animal first, Animal second);
}

class Main {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("dog", true, true));

    // Fails to compile when using Predicate
    // print(animals, new CheckCanJump()); 

    // Single statement lambda expressions, does not require block of code
    print(animals, animal -> animal.canSwim()); // animals that can swim
    print(animals, animal -> !animal.canSwim()); // animals that cannot swim

    print(animals, (Animal animal) -> {
      return animal.canJump(); // return is optional for one statement
    });

    print(animals, (Animal animal) -> {
      // Animal animal = new Animal("cat", true, false);
      System.out.println("checking animal= " + animal.getType());
      return animal.canJump();  // return is required for more than one statement
    });

    Animal fish = animals.get(0);
    Animal rabbit = animals.get(1);
    Animal dog = animals.get(2);

    print(fish, rabbit, (f, s) -> f.canJump() && s.canSwim()); // multiple parameters require brackets
    print(fish, dog, ((first, second) -> first.canSwim() && second.canSwim()));

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Anthony");
    names.add("Jimmy");
    names.add("Timmy");

    System.out.println("names= " + names);

    // .removeIf accepts Predicate.  
    names.removeIf(name -> name.charAt(0) == 'J'); // == is used for primitive variables
    System.out.println("after filter names= " + names);
  }

  private static void print(Animal first, Animal second, AnotherCheck check) {
    System.out.println(check.check(first, second));
  }

  private static void print(List<Animal> animals, Predicate<Animal> filter) {
    for(Animal animal: animals) {
      if(filter.test(animal)) { // for Predicate .test is used in place of .check
        System.out.println(animal.getType());
      }
    }

    System.out.println();
  }
}
