package task;

import java.util.Date;

public class Task {
    int id = 1;
    String name;
    String description;
    Date notificationDateTime;
    //Contact contact;
    //TaskState state;
    boolean isImportant;

    public void Task() {
        this.id = id++;
    }

    public void add(String taskName, String taskDescription, Boolean isImportant) {
        this.name = taskName;
        this.description = taskDescription;
        this.isImportant = isImportant;
    }

    //public void add(String name, String description, Date notificationDateTime, Contact contact, TaskState state, boolean isImportant){}

    void edit(int taskId){
    }

    void delete(int taskId){
    }
}
