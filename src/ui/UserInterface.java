package ui;

import cmd.*;
import interfaces.*;
import journal.TaskJournal;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserInterface implements Observable {

    List<Observer> observers;
    Boolean cmd_ok = false;
    String input = "";
    TaskJournal model;
    Display view;

    public UserInterface() {
        observers = new LinkedList<>();
    }

    public void addModel(TaskJournal m) {
        this.model = m;
    }

    public void addView(Display v) {
        this.view = v;
    }

    public void ReadCommand() {
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    cmd_ok = true;
                    ShowSheduler cmd_ShowSheduler = new ShowSheduler();
                    cmd_ShowSheduler.Execute();
                    break;
                case "2":
                    cmd_ok = true;
                    AddTask cmd_AddTask = new AddTask();
                    cmd_AddTask.Execute();
                    break;
                case "3":
                    cmd_ok = true;
                    EditTask cmd_EditTask = new EditTask();
                    cmd_EditTask.Execute();
                    break;
                case "4":
                    cmd_ok = true;
                    DeleteTask cmd_DeleteTask = new DeleteTask();
                    cmd_DeleteTask.Execute();
                    break;
                case "5":
                    cmd_ok = true;
                    AddContact cmd_AddContact = new AddContact();
                    cmd_AddContact.Execute();
                    break;
                case "6":
                    cmd_ok = true;
                    DeleteContact cmd_DeleteContact = new DeleteContact();
                    cmd_DeleteContact.Execute();
                    break;
                case "7":
                    cmd_ok = true;
                    Exit cmd_Exit = new Exit();
                    cmd_Exit.Execute();
                    break;
                default:
                    System.out.print("Illegal command. Please, try again (1-7): ");
                    cmd_ok = false;
                    break;
            }
        } while (!cmd_ok);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update();
    }
}
