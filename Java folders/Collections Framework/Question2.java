// Write a program to demonstrate HashMap and perform operations like put, get, and remove.

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        System.out.println("Initial HashMap: " + map);

        String keyToGet = "Banana";
        if (map..containsKey(keyToGet)) {
            int value = map.get(keyToGet);

            System.out.println("Value for key '" + keyToGet + "' :"  + value);
        } else {
            System.out.println("Key '" + keyToGet + "' not found.");
        }

        String keyToRemove = "Orange";
        if (map.containsKey(keyToRemovve)) {
            map.remove(keyToRemove);
            System.out.println("Removed key '" + keyToRemove + "'from HashMap.");
        } else {
            System.out.println("Key '" + keyToRemove + "'not found.");
        }

        System.out.println("Updated Hashmap: " + map);

        System.out.println("\nIterating over Hashmap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
   
        }
    }
}