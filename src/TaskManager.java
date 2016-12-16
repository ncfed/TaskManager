public class TaskManager {

    static String title = "Task Manager, v0.1. Developed by D. Fedotov.\n";

    public static void main(String[] args) {
        System.out.println(title);
        UserInterface ui = new UserInterface();
        ui.ShowMenu();
        ui.ReadCommand();
    }

}
