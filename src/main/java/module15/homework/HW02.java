package module15.homework;

public class HW02 {
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) {
        System.out.println("Запускаємо потоки, що можуть призвести до deadlock...");

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Потік 1: заблокував ресурс 1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Потік 1: намагається заблокувати ресурс 2...");
                synchronized (resource2) {
                    System.out.println("Потік 1: заблокував ресурс 1 та 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Потік 2: заблокував ресурс 2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Потік 2: намагається заблокувати ресурс 1...");
                synchronized (resource1) {
                    System.out.println("Потік 2: заблокував ресурс 1 та 2");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            System.out.println("Головний потік очікує завершення...");
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Головний потік завершив роботу.");
    }
}