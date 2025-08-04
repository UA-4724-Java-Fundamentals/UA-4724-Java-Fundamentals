package com.softserve.academy.module16file;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUri {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String uribase = "https://www.example.com/path/to/resource";
//        URL url = new URL(uribase);
//        System.out.println("url = " + url);
        //
        URI uri = new URI(uribase);
        System.out.println("uri = " + uri);
        //
        String pathString = uri.getPath();
        System.out.println("pathString = " + pathString);
        //
        Path path = Paths.get(pathString);
        //Path path = (Path) Paths.get(uri); // Error
        //Path path = (Path) Path.of(uri);
        //Path path = (Path) Paths.get(uri.getPath());
        System.out.println("path = " + path);
    }
}
