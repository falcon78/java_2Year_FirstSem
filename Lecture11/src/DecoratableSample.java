public class DecoratableSample {
  public static void main(String[] args) {
    Decoratable star, box, list, freeStyle;
    star = new Star("Hello Tokyo");
    box = new Box("Hello Japan");
    list = new List("Hello Universe", 3);
    freeStyle = new FreeStyle("test");
    star.decorate();
    box.decorate();
    list.decorate();
    freeStyle.decorate();
  }
}
