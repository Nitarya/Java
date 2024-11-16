// Write a Java program to read from a file using FileReader.

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        // Specify the file path here
        String filePath = "input.txt";
        
        // Create a FileReader and wrap it with BufferedReader for efficient reading
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        }
    }
}
