package examples;

import java.util.ArrayList;
import java.util.List;

public class SortAlgorithm {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("three");
        list.add("two");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        list.add("twelve");
        list.add("thirteen");
        list.add("fourteen");
        list.add("fifteen");
        list.add("sixteen");
        list.add("seventeen");
        list.add("eighteen");
        list.add("nineteen");
        list.add("twenty");
        list.add("twenty one");
        list.add("twenty two");
        list.add("twenty three");
        list.add("one hundred and twenty four");
        list.add("twenty four");
        list.add("twenty five");
        list.add("twenty six");
        list.add("twenty seven");
        list.add("twenty eight");
        list.add("twenty nine");
        list.add("thirty");
        list.add("thirty one");
        list.add("thirty two");
        list.add("thirty three");
        list.add("thirty four");
        list.add("thirty five");
        list.add("thirty six");
        list.add("thirty seven");
        list.add("thirty eight");
        list.add("thirty nine");
        list.add("forty");
        list.add("forty one");
        list.add("forty two");
        list.add("forty three");
        list.add("forty four");
        list.add("forty five");
        list.add("forty six");
        list.add("forty seven");
        list.add("forty eight");
        list.add("forty nine");
        list.add("fifty");
        list.add("fifty one");
        list.add("fifty two");
        list.add("fifty three");
        list.add("fifty four");
        list.add("fifty five");
        list.add("fifty six");
        list.add("fifty seven");
        list.add("fifty eight");
        list.add("fifty nine");
        list.add("sixty");
        list.add("sixty one");
        list.add("sixty two");
        list.add("sixty three");
        list.add("sixty four");
        list.add("sixty five");
        list.add("sixty six");
        list.add("sixty seven");
        list.add("sixty eight");
        list.add("sixty nine");
        list.add("seventy");
        list.add("seventy one");
        list.add("seventy two");
        list.add("seventy three");
        list.add("seventy seven");
        list.add("seventy five");
        list.add("seventy four");
        list.add("eighty one");
        list.add("seventy six");
        list.add("seventy eight");
        list.add("seventy nine");
        list.add("eighty");
        list.add("eighty five");
        list.add("eighty two");
        list.add("eighty three");
        list.add("eighty four");
        list.add("eighty eight");
        list.add("eighty six");
        list.add("eighty seven");
        list.add("ninety three");
        list.add("eighty nine");
        list.add("ninety");
        list.add("ninety one");
        list.add("ninety two");
        list.add("ninety six");
        list.add("ninety five");
        list.add("ninety seven");
        list.add("ninety four");
        list.add("ninety eight");
        list.add("ninety nine");
        list.add("one hundred");

        System.out.println("Before sorting: " + list);
        list.sort((s1, s2) -> s1.length() - s2.length());

        // ? Salto de Linea Triple
        System.out.println();System.out.println("--------------------------");System.out.println();

        System.out.println("After sorting: " + list);
    }
}
