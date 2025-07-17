package module09.homework.task1;

public class Main {
    public static void main(String[] args) {
        FullName workerName = new FullName("Bob", "Johnson");

        Person worker = new Person(workerName, 35) {
            @Override
            public String activity() {
                return "Building a house.";
            }
        };

        System.out.println(worker.info());
        System.out.println("Current activity: " + worker.activity());
    }
}

