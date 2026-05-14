package Equals_vs_HashCode;

class User {
    String email;

    @Override
    public boolean equals(Object o) {
        return this.email.equals((
                (User) o
        ).email);
    }

//    @Override
//    public int hashCode() {
//        return email.hashCode();
//    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.email = "mwangijohnmuriithi130@gmail.com";
        User user2 = new User();
        user2.email = "mwangijohnmuriithi130@gmail.com";

        System.out.print(user1.equals(user2));
    }
}
