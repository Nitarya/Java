public class PracticeSecondswitch{
    public static void main(String args[]) {
        int num =6;
        switch (num % 2) {
            case 0: 
                System.out.println("Value is even");
                break;
            case 1:
                System.out.println("Value is odd");
                break;
        }
    }
}