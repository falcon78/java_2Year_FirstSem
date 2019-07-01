import java.util.ArrayList;

public class DecoratableList {
  public static void main (String[] args){
    ArrayList<Decoratable> decoratableList = new ArrayList<>();
     decoratableList.add(new Star("Hello Tokyo"));
     decoratableList.add(new Box("Hello Japan"));
     decoratableList.add(new List("Hello Universe", 3));
     decoratableList.add(new FreeStyle("test"));
     for (Decoratable d : decoratableList){
      d.decorate();
    }
  }
}
