public class ThreadsHomework {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Task 1 ===");
        task1();

        System.out.println("\n=== Task 2 (deadlock demo) ===");
        task2();

        System.out.println("\n=== Task 3 ===");
        task3();
    }

    // 1) Запустити 3 потоки, кожен друкує повідомлення 5 разів.
    //    Третій стартує тільки після завершення перших двох.
    private static void task1() throws InterruptedException {
        Thread t1 = new Thread(() -> printMany("Thread #1 says hello", 5, 200));
        Thread t2 = new Thread(() -> printMany("Thread #2 says hi", 5, 200));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Thread t3 = new Thread(() -> printMany("Thread #3 starts after 1 & 2", 5, 200));
        t3.start();
        t3.join(); // дочекаємося, щоб побачити акуратний фінал
    }

    // 2) Спричинити deadlock між двома потоками.
    //    У main організувати очікування завершення і коректно вийти,
    //    якщо потоки «зависли» (join з таймаутом).
    private static void task2() throws InterruptedException {
        final Object lockA = new Object();
        final Object lockB = new Object();

        Runnable r1 = () -> {
            synchronized (lockA) {
                sleep(100);
                synchronized (lockB) {
                    System.out.println("R1 got both locks");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lockB) {
                sleep(100);
                synchronized (lockA) {
                    System.out.println("R2 got both locks");
                }
            }
        };

        Thread a = new Thread(r1, "A");
        Thread b = new Thread(r2, "B");
        a.start();
        b.start();

        // Чекаємо обмежений час — якщо дедлок, потоки не завершаться.
        a.join(1000);
        b.join(1000);

        if (a.isAlive() || b.isAlive()) {
            System.out.println("Deadlock detected. Main finishes after timeout.");
            // Зазвичай тут або переривають роботу програми, або прибирають дедлок.
            // Потоки залишаться «живими», але ми закінчимо main.
        } else {
            System.out.println("No deadlock, both threads finished.");
        }
    }

    // 3) Потік "one" запускає потік "two" (тричі друкує свій номер)
    //    та створює потік "three" (друкує повідомлення 5 разів).
    private static void task3() throws InterruptedException {
        Thread one = new Thread(() -> {
            Thread two = new Thread(() -> printMany("Thread number two", 3, 150), "two");
            two.start();

            Thread three = new Thread(() -> printMany("Thread number three", 5, 150), "three");
            three.start();

            try {
                two.join();
                three.join();
            } catch (InterruptedException ignored) {}
            System.out.println("Thread one finished after two & three.");
        }, "one");

        one.start();
        one.join();
    }

    // Допоміжні утиліти
    private static void printMany(String msg, int times, long pauseMs) {
        for (int i = 1; i <= times; i++) {
            System.out.println(msg + " [" + i + "]");
            sleep(pauseMs);
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {}
    }
}
