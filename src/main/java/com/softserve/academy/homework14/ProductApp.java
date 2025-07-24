package com.softserve.academy.homework14;


import java.util.*;
import java.util.stream.IntStream;

public class ProductApp {
    private static final int numberOfUsers = 20;

    public static void main(String[] args) {
        Random random = new Random();
        IntStream stream = IntStream.generate(() -> random.nextInt(5))
                .limit(numberOfUsers);

        List<Product> productList = stream.mapToObj(i -> new Product(random.nextInt(5), random.nextInt(5), getRandomPastDate(random), random.nextInt(5))).toList();

        long oneYearAgoMillis = System.currentTimeMillis() - (365L * 24 * 60 * 60 * 1000);

        List<Product> productsSortedList = productList.stream()
                .filter(product -> product.getCategory() == 3) // умовимось що категорія Phone = 3
                .filter(p -> p.getDate().getTime() < oneYearAgoMillis)
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        System.out.println(productsSortedList);
    }

    private static Date getRandomPastDate(Random random) {
        long now = System.currentTimeMillis();
        long maxPast = 3L * 365 * 24 * 60 * 60 * 1000; // 3 роки в мілісекундах
        long randomMillisAgo = (long) (random.nextDouble() * maxPast);
        return new Date(now - randomMillisAgo);
    }
}
