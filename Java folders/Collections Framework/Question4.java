// Write a Java program to sort an ArrayList of strings alphabetically.

import java.util.ArrayList;
import java.utils.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Charlie");
        names.add("Alice");
        names.add("Eve");
        names.add("Bob");

        System.out.println("Original list: " + names);

        Collections.sort(names);

        System.out.println("Sorted list: " + names);
    }
}
