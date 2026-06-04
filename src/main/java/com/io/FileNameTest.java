package main.java.com.io;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

// The program demonstrates toAbsolutePath method's helpfulness when processing 
// user-entered file names.

public class FileNameTest {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Asking the user to name their file and then process the absolutePath for the user input
            System.out.println("Enter path: ");
            String userInput = scanner.nextLine(); 
            // Converts the input string to a Path object
            Path inputPath = Path.of(userInput);

            // Gatekeeper: Verifying the presence of the path
            Path verifiedPath = inputPath.toRealPath();
            System.out.println("Verdict: Path exists: " + verifiedPath);

            // Converts the input Path to an absolutePath.
            // Generally this means prepending the current working directory.
            // If this example were called like this: 
            //      java FileNameTest foo
            // the getRoot and getParent methods would return null
            // on the original "inputPath" instance.
            // Invoking getRoot and getParent on the "fullPath" instance returns expected values.

            Path fullPath = inputPath.toAbsolutePath();
            System.out.println("Path Analysis");
            System.out.format("Original input: %s%n", inputPath);
            System.out.format("Absolute path: %s%n", fullPath);
            System.out.format("Parent folder; %s%n", fullPath.getParent());
            System.out.format("Root component; %s%n", fullPath.getRoot());
        } catch (IOException e) {
            System.err.format("File does not exist.");
            System.err.println(e.getMessage());
        }
    }
}
