package finalproject;

import java.io.*;

public class StorageService {
    private static final String PLANNER_FILE = "planner.dat";
    private static final String REPORT_FILE = "report.txt";

    public void savePlanner(LearningPlanner planner) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PLANNER_FILE))) {
            oos.writeObject(planner);
            System.out.println("💾 Дані успішно збережено у " + PLANNER_FILE);
        } catch (IOException e) {
            System.err.println("❌ Помилка збереження планувальника: " + e.getMessage());
        }
    }

    public LearningPlanner loadPlanner() {
        File file = new File(PLANNER_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                System.out.println("🔄 Завантаження даних з " + PLANNER_FILE);
                return (LearningPlanner) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("❌ Помилка завантаження даних. Створюється новий планувальник. Причина: " + e.getMessage());
            }
        }
        return new LearningPlanner();
    }

    public void saveReport(String reportContent) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(REPORT_FILE))) {
            writer.print(reportContent);
            System.out.println("📊 Звіт успішно збережено у файл " + REPORT_FILE);
        } catch (IOException e) {
            System.err.println("❌ Помилка збереження звіту: " + e.getMessage());
        }
    }
}