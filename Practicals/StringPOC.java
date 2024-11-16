public class StringPOC {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "Java Programming";


        char charAtIndex = str1.charAt(6);
        System.out.println("charAt(6): " + charAtIndex);

        int length = str1.length();
        System.out.println("length(): " + length);

        boolean containsSubstring = str1.contains("World");
        System.out.println("contains(\"World\"): " + containsSubstring);

        boolean isEqual = str1.equals(str2);
        System.out.println("equals(str2): " + isEqual);

        boolean isEqualUsingDoubleEquals = (str1 == str2);
        System.out.println("str1 == str2: " + isEqualUsingDoubleEquals);

        int indexOfChar = str1.indexOf("W");
        System.out.println("indexOf('W): " + indexOfChar);

        String upperCaseStr = str3.toUpperCase();
        System.out.println("toUpperCase(): " + upperCaseStr);

        String[] words = str1.split(" ");
        System.out.println("split(\" \"):");
        for (String word : words) {
            System.out.println(word);
        }
    }
}