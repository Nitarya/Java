// Write a program to find the frequency of elements in a HashMap.

public class FrequencyCounter {

    public static void main(String[] args) {
        int[] elements = {1,2,2,3,4,4,4,5};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element: elements) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
             } else {
                frequency.put(element, 1);
        }
        }

        for (Map.Entry<Integer, Integer>entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " ,Frequency:" + entry.getValue());
        }
    }
}
