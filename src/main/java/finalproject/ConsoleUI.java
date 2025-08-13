package finalproject;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleUI {
    private final LearningPlanner planner;
    private final StorageService storageService;
    private final Scanner scanner;

    public ConsoleUI(LearningPlanner planner, StorageService storageService) {
        this.planner = planner;
        this.storageService = storageService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> addTopic();
                case "2" -> markTopicAsCompleted();
                case "3" -> showProgress();
                case "4" -> generateReport();
                case "5" -> {
                    storageService.savePlanner(planner);
                    System.out.println("👋 До побачення!");
                    return;
                }
                default -> System.out.println("❌ Невірний вибір! Спробуйте ще раз.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== Learning Planner =====");
        System.out.println("1. Додати тему");
        System.out.println("2. Позначити тему як виконану");
        System.out.println("3. Показати прогрес");
        System.out.println("4. Згенерувати звіт у файл");
        System.out.println("5. Зберегти та вийти");
        System.out.print("Ваш вибір: ");
    }

    private void addTopic() {
        System.out.print("Введіть назву теми: ");
        String name = scanner.nextLine();

        System.out.print("Введіть опис: ");
        String desc = scanner.nextLine();

        LocalDate deadline = null;
        while (deadline == null) {
            System.out.print("Введіть дедлайн (YYYY-MM-DD): ");
            try {
                deadline = LocalDate.parse(scanner.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("❌ Неправильний формат дати! Будь ласка, використовуйте YYYY-MM-DD.");
            }
        }

        planner.addTopic(new Topic(name, desc, deadline));
        System.out.println("✅ Тему \"" + name + "\" успішно додано!");
    }

    private void markTopicAsCompleted() {
        System.out.print("Введіть назву теми для позначення як виконаної: ");
        String name = scanner.nextLine();
        if (planner.markTopicAsCompleted(name)) {
            System.out.println("👍 Тему \"" + name + "\" позначено як виконану!");
        } else {
            System.out.println("🤔 Тему не знайдено або її вже було виконано.");
        }
    }

    private void showProgress() {
        System.out.println("\n----- Поточний прогрес -----");
        planner.getTopics().forEach(System.out::println);
        long completedCount = planner.getTopics().stream().filter(Topic::isCompleted).count();
        long totalCount = planner.getTopics().size();
        System.out.printf("Всього виконано: %d з %d%n", completedCount, totalCount);
        System.out.println("---------------------------");
    }

    private void generateReport() {
        String report = planner.generateProgressReport();
        storageService.saveReport(report);
    }
}