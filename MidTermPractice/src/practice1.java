import java.util.*;

public class practice1 {
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        list.add(21);
        list.add(23);
        for (Integer i : list) {
            System.out.println(i);
        }
        list.remove(0);
        for (Integer i : list) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public void addInt(int add) {
        list.add(add);
    }


}