public class Question3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Initial value of a is " + a);
        System.out.println("Initial value of b is " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("Final Value of a is " + a );
        System.out.println("Final Value of b is " + b );
    }
}