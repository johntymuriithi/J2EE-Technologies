package Generics;

class NonGen {
    Object  ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;

        iob = new NonGen(88);

        iob.showType();

        int v = (Integer) iob.getOb();
        System.out.println("value: " + v);

        System.out.println();

        NonGen strOb = new NonGen("Non-Generics Test");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("value: " + str);

        iob = strOb;
        v = (Integer) iob.getOb();
    }
}
