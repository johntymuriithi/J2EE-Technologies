package Interfaces;

interface InterfacerMainer {
    default void callBackMainer() {
        System.out.println("Hellow World");
    };
}

interface Interfacer extends InterfacerMainer{
//    InterfacerMainer.super.callBackMainer();
}

class Client implements Interfacer {
    public void callBackMainer(String msg) {
        System.out.println(msg);
    }
}

class AnotherClient implements Interfacer {
    public void callBack(String msg) {
        System.out.println("Another Version of Callback");
        System.out.println(msg);
    }
}

public class Main implements MyInterface{
    public static void main(String[] args) {
        Interfacer interfacer = new Client();
        AnotherClient anotherClient = new AnotherClient();
    }
}