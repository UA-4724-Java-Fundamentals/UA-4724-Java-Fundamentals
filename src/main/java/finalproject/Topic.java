package finalproject;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Topic implements Serializable {
    // Додаємо serialVersionUID для стабільності серіалізації
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

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

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public LocalDate getDeadline() { return deadline; }
    public boolean isCompleted() { return completed; }

    public void markCompleted() {
        if (!this.completed) {
            this.completed = true;
            this.completedDate = LocalDate.now();
        }
    }

    @Override
    public String toString() {
        String status = completed ? "[✔]" : "[ ]";
        String deadlineStr = " (Дедлайн: " + deadline.format(DATE_FORMATTER) + ")";
        String completedStr = completed ? " — виконано: " + completedDate.format(DATE_FORMATTER) : "";
        return String.format("%s %s%s%s", status, name, deadlineStr, completedStr);
    }
}