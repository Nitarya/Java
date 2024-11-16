// Write a program to create a new file and write data into it.

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "output.txt";
        // Data to write into the file
        String data = "This is the content to write into the file.";

        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter(fileName);

            // Write data to the file
            writer.write(data);

            // Close the file writer to release resources
            writer.close();

            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
