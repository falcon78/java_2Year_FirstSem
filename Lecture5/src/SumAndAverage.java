import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SumAndAverage {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("整数を入力してください");
        Integer accumulator = 0;
        try {
            while (input.hasNext()) {
                Integer line = input.nextInt();
                inputList.add(line);
            }
        } catch (InputMismatchException error) {
            System.out.println("整数のみを入力してください。（型が違います）");
            System.out.println(error);
        }
        for (Integer number : inputList) {
            System.out.println(number);
            accumulator = accumulator + number;
        }
        System.out.println(accumulator);
        System.out.println(accumulator / inputList.size());
    }
}
