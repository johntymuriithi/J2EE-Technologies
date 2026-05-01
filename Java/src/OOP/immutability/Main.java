package OOP.immutability;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Event event = new Event(date); // You exposed your internal state by reference

        System.out.println(event.getDate());
        date.setTime(0); // modifies Event internally
        System.out.println(event.getDate());

        // =========================================
        // shallow copy
//        User user = new User(new ArrayList<>(List.of("john", "Mwangi")));
//        System.out.println(user.getRoles().add("peter")); & user.add("kim")

//        for (String role : user.getRoles()) {
//            System.out.println(role);
//        }

        // ==========================================
        //deep copy
        List<UserRole> roles = new ArrayList<>();
        roles.add(new UserRole("ADMIN"));

        User user = new User(roles);
//        roles.get(0).setName("HACKED");
//        user.getRoles().get(0).setName("HACKED");
    }
}
