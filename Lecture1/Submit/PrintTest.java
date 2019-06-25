public class PrintTest {
    private static int limit = 5;
    private static int limitSpace = 5;

    public static void main(String[] args) {
        for (int i = 0; i < limit; i++) {
            for (int k = limitSpace; k > 0; k--) {
                System.out.print(' ');
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print('*');
            }
            System.out.println();
            limitSpace -= 1;
        }
        System.out.println("Hello World");
    }
}