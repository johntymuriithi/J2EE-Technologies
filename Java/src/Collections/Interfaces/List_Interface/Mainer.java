package Collections.Interfaces.List_Interface;

import java.util.*;

public class Mainer {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("John", "Muriithi")); // this is thread

        for (String name : names) {
            System.out.println(name);
        }
    }
}
