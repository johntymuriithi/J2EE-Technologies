package OOP.immutability;

import java.util.List;

public class User {
//    private final List<String> roles; // shallow immutability
    private final List<UserRole> roles;

    public User(List<UserRole> roles) {
        this.roles = List.copyOf(roles);  // shallow immutability, not deep immutability
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    /*
        “The class is not immutable because it exposes a mutable list directly. To fix it, we perform defensive copying in
        the constructor and return an unmodifiable view or copy in the getter to prevent external modification.”
     */
}
