package com.softserve.academy.module01.HW17;

public class Task12 {
    public static String run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Мета: Знайти суму всіх чисел менше 1000, які діляться на 3 або 5.\n");
        sb.append("Числа, що підходять: ");

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                sb.append(i).append(" ");
            }
        }
        sb.append("\nСума: ").append(sum);
        return sb.toString();
    }
}


