public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.print("Accessing element at 10:" + numbers[10]);
        } catch (ArrayIndexOutofBoundsException e) {
            System.out.println("Error:" + e.getMessage());
            System.out.println("You tried to access an index that is out of bounds.");
        } finally {
            System.out.println("End of the program.")
        }
    }
}