package com.softserve.academy.module11map;

import java.util.*;

public class ProgUUID {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "J.Bloch");
        Book book2 = new Book("Java, a Beginner's Guide", "H.Schildt");
        UUID uuid = UUID.randomUUID();

        Map<String, Book> books = new HashMap<>();
        //Map<String, Book> ht = new Hashtable<>();
        //
        books.put(UUID.randomUUID().toString(), book1);
        books.put(uuid.toString(), new Book("Java the Complete Reference", "H.Schildt"));
        books.put(UUID.randomUUID().toString(), book2);

        Iterator<Map.Entry<String, Book>> iter = books.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Book> entry = iter.next();
            System.out.println(entry.getKey() + "->" + entry.getValue().toString());
        }
    }
}