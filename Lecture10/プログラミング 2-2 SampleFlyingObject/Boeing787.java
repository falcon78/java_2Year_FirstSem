public class Boeing787 extends Plane implements FlyingObject {
    public static void main(String[] args) {

    }

    public void fly() {
        String className = this.getClass().getSimpleName();
        System.out.println(className + "が飛びます。");
    }


}
