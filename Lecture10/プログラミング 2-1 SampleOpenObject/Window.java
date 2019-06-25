public class Window extends OpenObject {
    public static void main(String[] args) {

    }

    public void open() {
        String className = this.getClass().getSimpleName();
        System.out.println(className + "が開きます");
    }
}
