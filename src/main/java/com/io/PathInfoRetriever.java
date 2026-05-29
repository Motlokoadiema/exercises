package com.io;

// We define an Path instance and invoke several methods to obtain information about the path

import java.nio.file.Path;

public class PathInfoRetriever {

    public static void main(String[] args){
        Path path = Path.of("src/main/resources/targetFile.txt");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subPath(0, 2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
        System.out.format("toURI: %s%n", path.toUri());
}
}