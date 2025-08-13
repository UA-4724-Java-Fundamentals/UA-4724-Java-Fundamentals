package finalproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearningPlanner implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Topic> topics;

    public LearningPlanner() {
        this.topics = new ArrayList<>();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public List<Topic> getTopics() {
        return new ArrayList<>(topics); // Повертаємо копію, щоб уникнути зовнішніх змін
    }

    public boolean markTopicAsCompleted(String name) {
        for (Topic t : topics) {
            if (t.getName().equalsIgnoreCase(name) && !t.isCompleted()) {
                t.markCompleted();
                return true;
            }
        }
        return false;
    }

    public String generateProgressReport() {
        if (topics.isEmpty()) {
            return "Список тем порожній. Додайте щось, щоб згенерувати звіт.";
        }

        long completedCount = topics.stream().filter(Topic::isCompleted).count();
        long totalCount = topics.size();
        double percentage = (totalCount == 0) ? 0 : ((double) completedCount / totalCount) * 100;

        StringBuilder report = new StringBuilder();
        report.append("===== ЗВІТ ПРО ПРОГРЕС НАВЧАННЯ =====\n\n");
        report.append(String.format("Всього тем: %d\n", totalCount));
        report.append(String.format("Виконано тем: %d\n", completedCount));
        report.append(String.format("Прогрес: %.2f%%\n\n", percentage));
        report.append("Детальний список тем:\n");
        report.append("--------------------------------\n");

        for (Topic topic : topics) {
            report.append(topic.toString()).append("\n");
        }

        report.append("\n=====================================\n");
        return report.toString();
    }
}