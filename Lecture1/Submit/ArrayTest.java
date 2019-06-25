import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args){
        int[] array =  {11,12,13,14,15,16,17,18,19,20};
        Arrays.stream(array).forEach(System.out::println);
    }
}