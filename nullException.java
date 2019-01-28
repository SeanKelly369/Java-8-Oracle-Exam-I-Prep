class nullException { // Another Class

  public void go() {
    System.out.print("A");
    try {
      stop();
    } catch ( ArithmeticException e ) {
      System.out.print("B");
    } finally {
      System.out.print("C");
      }
      System.out.print("D");
  }
  public void stop() {
    System.out.print("E");
    Object x = null;
    x.toString(); // causes nullPointerException
    System.out.print("F"); // this code is never reached
  }

  public static void main(String[] args) {
    new nullException().go(); // AEC along with nullPointerException is printed to the console
  }
}
