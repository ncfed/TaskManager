package ui;

import journal.TaskJournal;
import interfaces.*;

public class Display implements Observer {

    TaskJournal model;
    UserInterface controller;

    static String title = "=================================================\n" +
                        "|| Task Manager, v0.8. Developed by D. Fedotov ||\n" +
                        "=================================================\n";

    static String str_menu = "1 - Show scheduler\n" + "2 - Add task\n" + "3 - Edit task\n" + "4 - Delete task\n" +
                            "5 - Add contact\n" + "6 - Delete contact\n" + "7 - Exit\n\n" +
                            "Please, choose the action (1-7): ";

    public Display() {
        System.out.println(title);
    }

    public void ShowMainMenu() {
        System.out.print(str_menu);
    }

    public void addModel(TaskJournal tj) {
        this.model = tj;
    }

    public void addController(UserInterface ui) {
        this.controller = ui;
    }

    @Override
    public void update() {

    }
}
