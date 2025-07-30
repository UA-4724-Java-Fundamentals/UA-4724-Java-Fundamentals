import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(8000),
                new Swallow(1200),
                new Penguin(5000),
                new Kiwi(7000)
        };

        for (Bird b : birds) {
            System.out.println(b);
            b.fly();
            System.out.println();
        }
    }
}
