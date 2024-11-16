public class PracticeSwitch {
    public static void main(String args[]) {
        String name = "Akarsh";
        switch (name){
            case "Nitya":
                System.out.println("Matched with Nitya");
                break;
            case "Monu":
                System.out.println("Matched with Monu");
                break;
            case "John":
                System.out.println("Matched with John");
                break;
            default:
                System.out.println("No match found");
        }
    }
}