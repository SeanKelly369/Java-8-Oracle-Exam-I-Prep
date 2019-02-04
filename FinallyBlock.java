class FinallyBlock {
  public static void main(String[] args) {
    System.out.println(calculate());
  }

  public static int calculate() {
    try {
      return 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("error");
        // System.exit(0); // only error will get printed if this like is uncommented.
        return 1;
    } finally {
        System.out.println("finally");
        return 0;
    }
    // return 0 is printed, but if commented out, return 1 will get printed to console.
    // Output is error [nl] finally [nl] 0
  }
}
