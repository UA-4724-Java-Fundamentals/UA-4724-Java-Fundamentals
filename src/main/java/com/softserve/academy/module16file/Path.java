package com.softserve.academy.module16file;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Path {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String uribase = "https://career.softserveinc.com/";
        URI uri = new URI(uribase);
        System.out.println("uri = " + uri);
        //
        Path path = (Path) Paths.get(uri.getPath());
        System.out.println("path = " + path);
    }
}
