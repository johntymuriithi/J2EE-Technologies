package MultiThreading;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();  // this method returns a reference to a thread in which it is called

        System.out.println("Current thread: " + t);

        t.setName("My Thread");
        System.out.println("After name change: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
