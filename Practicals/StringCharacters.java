public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question,"
        + "Whether this nobler in the mind to suffer"
        + "the slings and arrows of outrageous fortune,"
        + "or to take arms against a sea of troubles,"
        + "and by opposing end them?";

        int spaces = 0, vowels = 0, constants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                spaces++;
            } else if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    constants++;
                }
            }
        }

        System.out.println("The text contained:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + constants);
        System.out.println("Spaces: " + spaces);
    }
}