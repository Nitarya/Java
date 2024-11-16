public class FinallyBlockExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

try {
    System.out.println("Accessing element: " + numbers[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Caught an exception:" + e.getMessage());
} finally  {
    System.out.println("Finally block executed.")
}

    }
}