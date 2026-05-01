package OOP.immutability;

public class UserRole {
    private final String name;

    public UserRole(String name) {
        this.name = name;
    }

//    void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }
}
