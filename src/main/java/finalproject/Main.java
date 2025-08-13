package finalproject;

public class Main {
    public static void main(String[] args) {
        StorageService storageService = new StorageService();
        LearningPlanner planner = storageService.loadPlanner();
        ConsoleUI consoleUI = new ConsoleUI(planner, storageService);

        consoleUI.start();
    }
}