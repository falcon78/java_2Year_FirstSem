public class DecoratableSample {
  public static void main(String[] args) {
    Decoratable star, box, list;
    star = new Star("Hello Tokyo");
    box = new Box("Hello Japan");
    list = new List("Hello Universe", 3);
    star.decorate();
    box.decorate();
    list.decorate();
  }
}
