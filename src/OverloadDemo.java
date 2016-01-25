/**
 * Created by medvedomg on 25.01.16.
 */
public class OverloadDemo {
    void test() {
        System.out.println("параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Внутренние преобразрование при вызове test(double) a: " + a);
    }

}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);

    }
}