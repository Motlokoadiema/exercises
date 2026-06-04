package com.io;

import java.io.IOException;
import java.nio.file.Path;

// We define an Path instance and invoke several methods to obtain information about the path

public class PathInfoRetriever {
    public static void main(String[] args) {
        // Given the subsequent path in the following line of code, edit the path to your machine's absolute path.
        Path path = Path.of("src/main/resources/targetFile.txt");

        // Adding exception handling for such cases wherein the file stored in 'path' 
        // above does not exist

        try {
            Path realPath = path.toRealPath();
            System.out.println("Verified real path: " + realPath); 

            System.out.format("toString: %s%n", path.toString());
            System.out.format("getFileName: %s%n", path.getFileName());
            System.out.format("getName(0): %s%n", path.getName(0));
            System.out.format("getNameCount: %d%n", path.getNameCount());
            System.out.format("subPath(0, 2): %s%n", path.subpath(0, 2));
            System.out.format("getParent: %s%n", path.getParent());
            System.out.format("getRoot: %s%n", path.getRoot());
            System.out.format("toURI: %s%n", path.toUri());
        } catch (IOException e) {
            System.err.format("%s: no such" + " file or directory%n", path.getFileName());
            System.err.println(e.getMessage());
        }
}
}