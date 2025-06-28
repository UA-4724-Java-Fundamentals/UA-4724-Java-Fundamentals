package com.softserve.academy.homework07.optional.one;

import java.util.Comparator;

public class EmployeeByWageDescComparator implements Comparator<Payment> {

    @Override
    public int compare(Payment o1, Payment o2) {
        return Double.compare(o2.calculatePay(), o1.calculatePay());
    }
}
