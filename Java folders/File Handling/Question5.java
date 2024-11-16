// Write a program to count the number of lines in a file.

import java.io.FileReader;
import java.io.IOException;

public class LinkCounter {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                lineCount++
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        System.out.println("Total number of lines: " + lineCount );
    }
}