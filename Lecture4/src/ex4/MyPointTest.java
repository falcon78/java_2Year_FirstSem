package ex4;

public class MyPointTest
{
    public static void main(String[] args) {
        MyPoint a, b, c, d;
        a = new MyPoint(6, 8);   // 1.
        b = new MyPoint(10, 10); // 2.
        c = new MyPoint(6, 8);   // 3.
        d = a;                   // 4.

        System.out.println("a 縺ｯ " + a);
        System.out.println("b 縺ｯ " + b);
        System.out.println("c 縺ｯ " + c);
        System.out.println("d 縺ｯ " + d);

        System.out.println("a equals b 縺ｯ "  + a.equals(b)); // 5.
        System.out.println("a equals c 縺ｯ "  + a.equals(c)); // 6.
        System.out.println("a equals d 縺ｯ "  + a.equals(d)); // 7.
        System.out.println("a == b 縺ｯ "  + (a == b)); // 8.
        System.out.println("a == c 縺ｯ "  + (a == c)); // 9.
        System.out.println("a == d 縺ｯ "  + (a == d)); // 10.
    }

}