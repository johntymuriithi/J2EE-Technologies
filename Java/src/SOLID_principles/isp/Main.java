package SOLID_principles.isp;

//interface Worker {
//    void work();
//    void eat();
//}
//
//class Robot implements Worker {
//    @Override
//    public void work(){
//        // This makes sense
//    }
//
//    @Override
//    public void eat(){
//        // This is irrelevant
//    }
//}

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot implements Workable {
    @Override
    public void work(){}
}

public class Main {
    public static void main(){}
}
