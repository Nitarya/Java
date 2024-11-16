// Write a program to iterate over a LinkedList

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIteration {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Iteration using for-each-loop:");
        for (Integer num : list) {
            System.out.println(num);
        }

        System.out.println("\nIteration using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}