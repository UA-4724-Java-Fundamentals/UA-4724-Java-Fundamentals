package com.softserve.academy.module01.HW17;

public class Task13 {
    public static String run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Мета: Знайти найменше число, яке ділиться на всі цілі числа від 1 до 20.\n");

        long num = 1;
        for (int i = 1; i <= 20; i++) {
            long oldNum = num;
            num = lcm(num, i);
            sb.append("LCM(").append(oldNum).append(", ").append(i).append(") = ").append(num).append("\n");
        }
        sb.append("Результат: ").append(num);
        return sb.toString();
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}

