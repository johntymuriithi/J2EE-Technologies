package JVM;

class GFG {
    static {
        System.out.println("GFG class is loaded by the JVM!");
    }

    public void display() {
        System.out.println("Method of GFG class is executed.");
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Main method started");

            Class.forName("GFG");

            GFG gfg = new GFG();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
