package journal;

import java.io.*;
import java.util.*;
import interfaces.Observable;
import interfaces.Observer;
import ui.*;
import task.*;

public class TaskJournal implements Observable, Observer {

    List<Observer> observers;
    UserInterface controller;
    Display view;
    String pathToFile;
    File taskJournalFile;
    String[] currentLine;
    public int numOfTasks = 0;
    public Map<String, Task> taskMap = new HashMap<String, Task>();

    public TaskJournal() {
        observers = new LinkedList<>();
        Scanner scanner = null;

        try {
            this.pathToFile = new File(".").getCanonicalPath() + "/resources/taskJournal.txt";
            this.taskJournalFile = new File(pathToFile);
            if (!taskJournalFile.exists()) {
                taskJournalFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            scanner = new Scanner(taskJournalFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine().split("\\|");
            taskMap.put(currentLine[0], new Task(Integer.parseInt(currentLine[0]), currentLine[1], currentLine[2], Boolean.parseBoolean(currentLine[3])));
            numOfTasks++;
        }

        /*System.out.println("DEBUG. file content: \n");

        for(Map.Entry<String, Task> pair : taskMap.entrySet())
        {
            int v1 = pair.getValue().id;
            String v2 = pair.getValue().name;
            String v3 = pair.getValue().description;
            boolean v4 = pair.getValue().isImportant;
            System.out.println(v1 + " " + v2 + " " + v3 + " " + v4 + "\n");
        }

        System.out.println("-------------------");*/

    }

    public void addController(UserInterface ui) {
        this.controller = ui;
    }

    public void addView(Display d) {
        this.view = d;
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

    @Override
    public void update() {

    }
}
