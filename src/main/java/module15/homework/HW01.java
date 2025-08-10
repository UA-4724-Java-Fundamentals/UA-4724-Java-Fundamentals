package module15.homework;

public class HW01 {

    public static void main(String[] args) {
        Runnable task1 = () -> printMessage("Потік 1 працює", 5);
        Runnable task2 = () -> printMessage("Потік 2 працює", 5);
        Runnable task3 = () -> printMessage("ПОТІК 3 СТАРТУВАВ", 5);

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        t1.start();
        t2.start();

        try {
            System.out.println("Головний потік чекає на завершення потоків 1 та 2...");
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Головний потік був перерваний");
        }

        System.out.println("Потоки 1 та 2 завершились. Запускаємо потік 3.");
        Thread t3 = new Thread(task3, "Thread-3");
        t3.start();
    }

    private static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}