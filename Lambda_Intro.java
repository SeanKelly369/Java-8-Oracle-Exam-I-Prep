import java.util.*;

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
interface CheckAnimal {
  boolean check(Animal animal);
}

// Create class to implement interface
class CheckCanJump implements CheckAnimal {
  @Override
  public boolean check(Animal animal) {
    return animal.canJump();
  }
}

class Main {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("dog", true, true));

    print(animals, new CheckCanJump());

    print(animals, animal -> animal.canSwim()); // animals that can swim
    print(animals, animal -> !animal.canSwim()); // animals that cannot swim
  }

  private static void print(List<Animal> animals, CheckAnimal filter) {
    for(Animal animal: animals) {
      if(filter.check(animal)) {
        System.out.println(animal.getType());
      }
    }

    System.out.println();
  }
}
