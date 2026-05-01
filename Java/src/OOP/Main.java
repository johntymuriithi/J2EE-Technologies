package OOP;

import java.util.Arrays;

enum status {
    CREATED, PAID, SHIPPED
}

class Shipment {
    public final String name = "John";

    // this is a static factory method
    public static Shipment shippingObject() {
        return new Shipment();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Shipment.shippingObject().name);
    }
}
