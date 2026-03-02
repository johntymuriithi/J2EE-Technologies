package Collections.Interfaces.Collection_Interface;

import java.util.*;

public class Mainer {
    public static void main(String[] args){
        List<String> names = new ArrayList<>(List.of("John", "", "Mwangi")); // this is mutable
        List<String> students = List.of("John", "Muriithi"); // this is immutable
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        List<String> people = Collections.unmodifiableList(Arrays.asList("Wamuyoro", "Kidiki", "Extent")); // before Java 9

        List<String> cows = new ArrayList<>(List.of("Mori", "Cheni"));
        List<String> cowe = List.of("Mori");

        Boolean finali = cows.removeAll(cowe);

        System.out.println(finali);
    }
}
