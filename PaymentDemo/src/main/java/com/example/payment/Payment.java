package com.example.payment;

/**
 * Інтерфейс, що зобов’язує реалізовувати метод для обчислення заробітної плати.
 */
public interface Payment {
    /**
     * Розрахувати оплату праці.
     * @return сума виплати
     */
    double calculatePay();
}
