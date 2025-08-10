package module15.homework;

public class HW03 {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Потік <один> стартував і запускає потік <два>");
            Thread two = new Thread(new ThreadTwo());
            two.start();
        });
        one.start();
    }
}

class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Повідомлення від потоку <два>, номер " + (i + 1));
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println("Потік <два> завершив свої повідомлення і запускає потік <три>");
        Thread three = new Thread(new ThreadThree());
        three.start();
    }
}

class ThreadThree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Повідомлення від потоку <три>, номер " + (i + 1));
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
        System.out.println("Потік <три> завершив роботу.");
    }
}