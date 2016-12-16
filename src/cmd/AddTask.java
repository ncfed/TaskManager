package cmd;

import java.util.Scanner;

import task.Task;

public class AddTask implements Command {

    String taskName, taskDescription, taskImportance = "";
    Boolean isImportant = false;
    Boolean no_error = false;

    @Override
    public void Execute() {
        System.out.println("---NEW TASK---");
        System.out.print("task.Task name: ");
        Scanner scanner = new Scanner(System.in);
        taskName = scanner.nextLine();
        System.out.print("task.Task description: ");
        taskDescription = scanner.nextLine();
        System.out.print("Is the task important? (y/n): ");
        do {
            taskImportance = scanner.nextLine();
            switch (taskImportance) {
                case "y":
                    isImportant = true;
                    no_error = true;
                    break;
                case "n":
                    isImportant = false;
                    no_error = true;
                    break;
                default:
                    System.out.print("Illegal input. Please, try again (y/n): ");
                    no_error = false;
                    break;
            }
        } while (!no_error);

        Task task = new Task();
        task.add(taskName, taskDescription, isImportant);
        System.out.println("---NEW TASK ADDED---");
    }

}
