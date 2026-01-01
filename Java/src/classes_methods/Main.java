package classes_methods;


class Demo {
    int width;

    Demo(int width) {
        this.width = width;
    }

    Demo(Demo d) {
        d.width = 20;
    }

    void test(int num) {
        num = 10;
        System.out.println(num);
    }
}


public class Main {
    public static void main(String[] args) {
        Integer num = Integer.valueOf(20); // this is explicit autoboxing
        System.out.println(num);
        Integer num1 = num;
        num1 = 30;
        System.out.println(num1);
    }
}
