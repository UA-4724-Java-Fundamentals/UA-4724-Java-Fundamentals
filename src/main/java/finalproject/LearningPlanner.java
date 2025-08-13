package finalproject;

/*додаток - Learning Planner
Ідея:
Додаток у консольному або простому JavaFX інтерфейсі, який допомагає планувати навчання, зберігати теми та відстежувати прогрес.

Основні можливості:

Додавання тем для вивчення (назва, дедлайн, опис).

Позначення тем як виконаних (із записом дати завершення).

Перегляд прогресу (кількість виконаних / загальна кількість).

Збереження даних у файл (.txt або .ser через серіалізацію).

Завантаження даних при наступному запуску.

 Генерація звіту у .txt з відсотком виконання.*/


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Topic implements Serializable {
    private String name;
    private String description;
    private LocalDate deadline;
    private boolean completed;
    private LocalDate completedDate;

    public Topic(String name, String description, LocalDate deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
        this.completedDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + name +
                " (Дедлайн: " + deadline + ")" +
                (completed ? " — виконано: " + completedDate : "");
    }
}

class LearningPlanner implements Serializable {
    private List<Topic> topics = new ArrayList<>();

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void markTopicAsCompleted(String name) {
        for (Topic t : topics) {
            if (t.getName().equalsIgnoreCase(name) && !t.isCompleted()) {
                t.markCompleted();
                System.out.println("✅ Тему \"" + name + "\" позначено як виконану!");
                return;
            }
        }
        System.out.println("❌ Тему не знайдено або вже виконана.");
    }

    public void showProgress() {
        long completedCount = topics.stream().filter(Topic::isCompleted).count();
        System.out.println("\nПрогрес: " + completedCount + "/" + topics.size() + " тем виконано.");
        for (Topic t : topics) {
            System.out.println(t);
        }
    }
}

public class Main {
    private static final String FILE_NAME = "planner.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LearningPlanner planner = loadFromFile();

        while (true) {
            System.out.println("\n===== Learning Planner =====");
            System.out.println("1. Додати тему");
            System.out.println("2. Позначити тему як виконану");
            System.out.println("3. Показати прогрес");
            System.out.println("4. Зберегти та вийти");
            System.out.print("Ваш вибір: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Введіть назву теми: ");
                    String name = sc.nextLine();
                    System.out.print("Введіть опис: ");
                    String desc = sc.nextLine();
                    System.out.print("Введіть дедлайн (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());
                    planner.addTopic(new Topic(name, desc, date));
                }
                case "2" -> {
                    System.out.print("Введіть назву теми для позначення: ");
                    planner.markTopicAsCompleted(sc.nextLine());
                }
                case "3" -> planner.showProgress();
                case "4" -> {
                    saveToFile(planner);
                    System.out.println("💾 Дані збережено. До побачення!");
                    return;
                }
                default -> System.out.println("❌ Невірний вибір!");
            }
        }
    }

    private static void saveToFile(LearningPlanner planner) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(planner);
        } catch (IOException e) {
            System.out.println("Помилка збереження: " + e.getMessage());
        }
    }

    private static LearningPlanner loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (LearningPlanner) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new LearningPlanner();
        }
    }
}

