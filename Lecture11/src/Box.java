public class Box implements Decoratable {
  private String str;

  Box(String str) {
    this.str = str;
  }

  public void decorate() {
    this.printLine();
    System.out.println("|" + this.str + "|");
    this.printLine();
  }

  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < this.str.length(); i++) {
      System.out.print("-");
    }
    System.out.print("+");
    System.out.println();
  }
}
