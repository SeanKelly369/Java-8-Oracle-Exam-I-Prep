class CatchWithReturn {  
  public static void main(String[] args) {

  }

  public static int calculate() {
    try {
      System.exit(0); // In this case nothing gets printed
      return 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("error");
        System.exit(0); // terminates and only prints error and only case where finally is not executed
        return 1;
    } finally {
        System.out.println("finally");
        return 0;  // 0 gets printed rather than 1
    }
  }
}
