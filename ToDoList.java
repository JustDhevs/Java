import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markAsCompleted(scanner);
                    break;
                case 4:
                    removeTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void markAsCompleted(Scanner scanner) {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter the task number to mark as completed: ");
            int taskNumber = scanner.nextInt();
            if (isValidTaskNumber(taskNumber)) {
                String completedTask = tasks.remove(taskNumber - 1);
                System.out.println("Task marked as completed: " + completedTask);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        viewTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();
            if (isValidTaskNumber(taskNumber)) {
                String removedTask = tasks.remove(taskNumber - 1);
                System.out.println("Task removed: " + removedTask);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    private static boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >= 1 && taskNumber <= tasks.size();
    }
}
