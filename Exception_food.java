
class NoMoreMeatException extends Exception {} // extends Exception makes it a runtime exception

class NoMorePlantsExceptsion extends RuntimeException {} // unchecked exception aka RuntimeException

interface Omnivore {
  void eatMeat(int amount);

  void eatPlants(int amont);
}

class Bear implements Omnivore (

  @Override
  public void eatMeat (int amount) {
      if(amount <= 0) {
        throw new NoMoreMeatException();
      }

      System.out.println("Eating meat.");
  }

  @Override
  public void eatPlants(int amount) {

  }
)

class MethodsWithExceptions {

  public static void main(String[] args) {

  }
}
