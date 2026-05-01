package Data_Types;

class User {
    String name;
    Integer age;

    User(String name, Integer age) {
        this.age = age;
        this.name = name;
    }
}
class Mainer {
    static void change(User user) {
        user.name = "Freshii";
        user = new User("Kamaue", 34);
    }
}
public class Main {
    public static void main(String[] args) {
        User user = new User("john", 30);

        System.out.println(user.name);

        Mainer.change(user);

        System.out.println(user.name);
    }
}
