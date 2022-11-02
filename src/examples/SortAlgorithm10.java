package examples;

import java.util.ArrayList;
import java.util.List;

public class SortAlgorithm10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1"); // * 1
        list.add("10"); // * 2
        list.add("100"); // * 3
        list.add("1000"); // * 4
        list.add("10000"); // * 5
        list.add("100000"); // * 6
        list.add("1000000"); // * 7
        list.add("10000000"); // * 8
        list.add("100000000"); // * 9
        list.add("1000000000"); // * 10

        System.out.println("Before sorting: " + list);
        list.sort((s2, s1) -> s1.length() - s2.length());

        // ? Salto de Linea Triple
        System.out.println();System.out.println("--------------------------");System.out.println();

        System.out.println("After sorting: " + list);
    }
}
