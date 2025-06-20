package com.softserve.academy.homework05;

import java.util.Arrays;

public class GapInPrimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(10, 300, 400)));
    }

    static long[] gap(int g, long m, long n) {
        for (long i = m; i < n; i++) {
            if (isSimpleNumber(i) && isSimpleNumber(i + g) && hasSimpleNumberInArrange(i, i + g)) {
                return new long[]{i, i + g};
            }
        }
        return null;
    }

    static boolean hasSimpleNumberInArrange(long from, long to) {
        for (long i = from + 1; i < to; i++) {
            if (isSimpleNumber(i)) return false;
        }
        return true;
    }

    static boolean isSimpleNumber(long number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        long sqrt = (long) Math.sqrt(number);
        for (long i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }

        return true;
    }
}
