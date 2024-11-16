// Write a program to append text to an existing file.

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {
        String filePath = "example.txt";  // Replace with your file path
        String textToAppend = "This is the appended text.\n";

        try {
            FileWriter writer = new FileWriter(filePath, true);  // 'true' indicates append mode
            writer.write(textToAppend);
            writer.close();
            System.out.println("Text appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
