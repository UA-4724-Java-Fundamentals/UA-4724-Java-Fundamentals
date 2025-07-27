package com.softserve.academy.module01.HW12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст із зазначенням суми у форматі $XX.XX: ");
        String input = scanner.nextLine();

        // 2. Задаём шаблон для поиска валюты США
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(input);

        // 3. Ищем и выводим все совпадения
        System.out.println("Знайдені суми у форматі $XX.XX:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("Збігів не знайдено.");
        }

        scanner.close();
    }
}

