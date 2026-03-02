package Collections.Interfaces.Set_Interface;

import java.util.*;

class User {
    private final String email;

    User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}

public class Mainer {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("john@gmail.com"));
        users.add(new User("john@gmail.com"));

        System.out.println(users.size());
    }
}
