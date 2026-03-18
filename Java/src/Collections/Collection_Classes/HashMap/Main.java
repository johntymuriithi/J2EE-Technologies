package Collections.Collection_Classes.HashMap;

import java.util.*;

class User {
    transient String email;

    User(String email) {
        this.email = email;
    }
}

class Hasher{
    static void beginner() {
        HashMap<Object, Integer> map = new HashMap<>();

        User user = new User("john");
        User user2 = new User("john");

        map.put(user, 100);
        System.out.println(map.get(user2));
    }
}

public class Main {
    public static void main(String[] args) {
        Hasher.beginner();

        System.out.println("John".equals(new String("John")));
        System.out.println("John".hashCode());
    }
}