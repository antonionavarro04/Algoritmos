package examples;

import java.util.ArrayList;
import java.util.List;

public class SortAlgorithmAnimals {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        

        System.out.println("Before sorting: " + list);
        list.sort((s1, s2) -> s1.length() - s2.length());

        // ? Salto de Linea Triple
        System.out.println();System.out.println("--------------------------");System.out.println();

        System.out.println("After sorting: " + list);
    }
}
