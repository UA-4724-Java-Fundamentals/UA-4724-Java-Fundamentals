package com.softserve.academy.module01.HW17;

public class Task14 {
    public static String run() {
        StringBuilder sb = new StringBuilder();
        sb.append("Мета: Порахувати кількість способів, якими можна набрати £2 з монет:\n");
        sb.append("1p, 2p, 5p, 10p, 20p, 50p, £1, £2.\n");

        int target = 200;
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        int[] ways = new int[target + 1];
        ways[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= target; j++) {
                ways[j] += ways[j - coin];
            }
        }

        sb.append("Результат: ").append(ways[target]).append(" комбінацій.");
        return sb.toString();
    }
}


